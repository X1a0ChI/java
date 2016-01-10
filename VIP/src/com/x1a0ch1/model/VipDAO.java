package com.x1a0ch1.model;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Vip
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.x1a0ch1.model.Vip
 * @author MyEclipse Persistence Tools
 */
public class VipDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(VipDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String AGE = "age";
	public static final String PROFESSION = "profession";

	public void save(Vip transientInstance) {
		log.debug("saving Vip instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Vip persistentInstance) {
		log.debug("deleting Vip instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Vip findById(java.lang.String id) {
		log.debug("getting Vip instance with id: " + id);
		try {
			Vip instance = (Vip) getSession().get("com.x1a0ch1.model.Vip", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Vip instance) {
		log.debug("finding Vip instance by example");
		try {
			List results = getSession().createCriteria("com.x1a0ch1.model.Vip")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Vip instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Vip as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByAge(Object age) {
		return findByProperty(AGE, age);
	}

	public List findByProfession(Object profession) {
		return findByProperty(PROFESSION, profession);
	}

	public List findAll() {
		log.debug("finding all Vip instances");
		try {
			String queryString = "from Vip";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Vip merge(Vip detachedInstance) {
		log.debug("merging Vip instance");
		try {
			Vip result = (Vip) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Vip instance) {
		log.debug("attaching dirty Vip instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Vip instance) {
		log.debug("attaching clean Vip instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}