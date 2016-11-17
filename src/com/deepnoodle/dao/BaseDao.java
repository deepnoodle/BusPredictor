package com.deepnoodle.dao;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.deepnoodle.metro.model.TripStatus;
import com.deepnoodle.metro.service.MetroService;
import com.deepnoodle.model.IsEntity;

@Transactional
public abstract class BaseDao<T extends IsEntity> {
	private static final Logger log = LogManager.getLogger(MetroService.class);

	@Autowired
	protected SessionFactory sessionFactory;

	protected abstract Class<T> getEntityClass();

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(T entity) {
		getCurrentSession().save(entity);
		log.debug("save");
	}

	public void saveOrUpdate(T entity) {
		getCurrentSession().saveOrUpdate(entity);
		log.debug("saveOrUpdate");

	}

	public void delete(TripStatus entity) {
		getCurrentSession().delete(entity);
		log.debug("delete");
	}

	protected Criteria applyMinAndMax(Criteria criteria, Integer start, Integer end) {
		if (start != null) {
			criteria.setFirstResult(start);
		}
		if (end != null) {
			criteria.setMaxResults(end);
		}

		return criteria;
	}

}
