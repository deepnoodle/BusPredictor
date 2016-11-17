package com.deepnoodle.traffic.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.deepnoodle.dao.BaseDao;
import com.deepnoodle.traffic.model.TravelTime;

@Repository
public class TravelTimeDao extends BaseDao<TravelTime> {
	@Override
	protected Class<TravelTime> getEntityClass() {
		return TravelTime.class;
	}

	public List<TravelTime> get(String direction, Date startDate, Date endDate, Double fromPositionLat,
			Double fromPositionLon,
			Double toPositionLat, Double toPositionLon, Double fuzzyness) {

		CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<TravelTime> criteria = criteriaBuilder.createQuery(getEntityClass());
		Root<TravelTime> root = criteria.from(getEntityClass());
		criteria.select(root);

		criteria.where(criteriaBuilder.between(
				root.get("startlatitude"),
				fromPositionLat - fuzzyness,
				fromPositionLat + fuzzyness));
		criteria.where(criteriaBuilder.between(
				root.get("startlongitude"),
				fromPositionLon - fuzzyness,
				fromPositionLon + fuzzyness));
		criteria.where(criteriaBuilder.between(
				root.get("endlatitude"),
				toPositionLat - fuzzyness,
				toPositionLat + fuzzyness));
		criteria.where(criteriaBuilder.between(
				root.get("endlongitude"),
				toPositionLon - fuzzyness,
				toPositionLon + fuzzyness));

		criteria.where(criteriaBuilder.between(
				root.get("createDate"),
				startDate,
				endDate));

		criteria.where(criteriaBuilder.equal(
				root.get("startdirection"),
				direction));

		criteria.orderBy(criteriaBuilder.desc(root.get("createDate")));
		return getCurrentSession().createQuery(criteria).getResultList();

	}
}
