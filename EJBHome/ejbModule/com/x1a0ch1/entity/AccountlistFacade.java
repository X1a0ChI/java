package com.x1a0ch1.entity;

import java.sql.Timestamp;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Facade for entity Accountlist.
 * 
 * @see com.x1a0ch1.entity.Accountlist
 * @author MyEclipse Persistence Tools
 */
@Stateless
public class AccountlistFacade implements AccountlistFacadeLocal,
		AccountlistFacadeRemote {
	// property constants
	public static final String ACCOUNT_TYPE = "accountType";
	public static final String ACCOUNT = "account";
	public static final String PASSWORD = "password";
	public static final String NAME = "name";
	public static final String CARD_NUM = "cardNum";
	public static final String CARD_TYPE = "cardType";
	public static final String ADDRESS = "address";
	public static final String ZIP = "zip";
	public static final String CARD_CASH = "cardCash";

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Perform an initial save of a previously unsaved Accountlist entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method.
	 * 
	 * @param entity
	 *            Accountlist entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Accountlist entity) {
		LogUtil.log("saving Accountlist instance", Level.INFO, null);
		try {
			entityManager.persist(entity);
			LogUtil.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent Accountlist entity.
	 * 
	 * @param entity
	 *            Accountlist entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Accountlist entity) {
		LogUtil.log("deleting Accountlist instance", Level.INFO, null);
		try {
			entity = entityManager.getReference(Accountlist.class,
					entity.getId());
			entityManager.remove(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Accountlist entity and return it or a copy of
	 * it to the sender. A copy of the Accountlist entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity.
	 * 
	 * @param entity
	 *            Accountlist entity to update
	 * @return Accountlist the persisted Accountlist entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Accountlist update(Accountlist entity) {
		LogUtil.log("updating Accountlist instance", Level.INFO, null);
		try {
			Accountlist result = entityManager.merge(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Accountlist findById(Integer id) {
		LogUtil.log("finding Accountlist instance with id: " + id, Level.INFO,
				null);
		try {
			Accountlist instance = entityManager.find(Accountlist.class, id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Accountlist entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Accountlist property to query
	 * @param value
	 *            the property value to match
	 * @return List<Accountlist> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Accountlist> findByProperty(String propertyName,
			final Object value) {
		LogUtil.log("finding Accountlist instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from Accountlist model where model."
					+ propertyName + "= :propertyValue";
			Query query = entityManager.createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<Accountlist> findByAccountType(Object accountType) {
		return findByProperty(ACCOUNT_TYPE, accountType);
	}

	public List<Accountlist> findByAccount(Object account) {
		return findByProperty(ACCOUNT, account);
	}

	public List<Accountlist> findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List<Accountlist> findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List<Accountlist> findByCardNum(Object cardNum) {
		return findByProperty(CARD_NUM, cardNum);
	}

	public List<Accountlist> findByCardType(Object cardType) {
		return findByProperty(CARD_TYPE, cardType);
	}

	public List<Accountlist> findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List<Accountlist> findByZip(Object zip) {
		return findByProperty(ZIP, zip);
	}

	public List<Accountlist> findByCardCash(Object cardCash) {
		return findByProperty(CARD_CASH, cardCash);
	}

	/**
	 * Find all Accountlist entities.
	 * 
	 * @return List<Accountlist> all Accountlist entities
	 */
	@SuppressWarnings("unchecked")
	public List<Accountlist> findAll() {
		LogUtil.log("finding all Accountlist instances", Level.INFO, null);
		try {
			final String queryString = "select model from Accountlist model";
			Query query = entityManager.createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Accountlist> findList(String name){
		final String qS ="select model from Accountlist model where model.name like '%"+name+"%'"; 
		Query query=entityManager.createQuery(qS);
		return query.getResultList();
	}
		
}