package com.x1a0ch1.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.ejb.Remote;

/**
 * Remote interface for AccountlistFacade.
 * 
 * @author MyEclipse Persistence Tools
 */
@Remote
public interface AccountlistFacadeRemote {
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
	public void save(Accountlist entity);

	/**
	 * Delete a persistent Accountlist entity.
	 * 
	 * @param entity
	 *            Accountlist entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Accountlist entity);

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
	public Accountlist update(Accountlist entity);

	public Accountlist findById(Integer id);

	/**
	 * Find all Accountlist entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Accountlist property to query
	 * @param value
	 *            the property value to match
	 * @return List<Accountlist> found by query
	 */
	public List<Accountlist> findByProperty(String propertyName, Object value);

	public List<Accountlist> findByAccountType(Object accountType);

	public List<Accountlist> findByAccount(Object account);

	public List<Accountlist> findByPassword(Object password);

	public List<Accountlist> findByName(Object name);

	public List<Accountlist> findByCardNum(Object cardNum);

	public List<Accountlist> findByCardType(Object cardType);

	public List<Accountlist> findByAddress(Object address);

	public List<Accountlist> findByZip(Object zip);

	public List<Accountlist> findByCardCash(Object cardCash);

	/**
	 * Find all Accountlist entities.
	 * 
	 * @return List<Accountlist> all Accountlist entities
	 */
	public List<Accountlist> findAll();
	public List<Accountlist> findList(String name);
}