package com.deepnoodle.metro.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.deepnoodle.dao.BaseDao;
import com.deepnoodle.metro.model.TripStatus;

@Repository
public class TripStatusDao extends BaseDao<TripStatus> {
	@Override
	protected Class<TripStatus> getEntityClass() {
		return TripStatus.class;
	}

	public TripStatus getLast(String activeTripId) {
		CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();

		CriteriaQuery<TripStatus> criteria = criteriaBuilder.createQuery(getEntityClass());
		Root<TripStatus> tripStatusRoot = criteria.from(getEntityClass());
		criteria.select(tripStatusRoot);
		criteria.where(criteriaBuilder.equal(tripStatusRoot.get("activeTripId"), activeTripId));
		criteria.orderBy(criteriaBuilder.desc(tripStatusRoot.get("createDate")));
		List<TripStatus> results = getCurrentSession().createQuery(criteria).getResultList();
		if (results == null || results.size() == 0) {
			return null;
		} else {
			return results.get(0);
		}
	}

}
