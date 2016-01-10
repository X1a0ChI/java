package com.x1a0ch1.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.ejb.Local;


@Local
public interface AccountlistFacadeLocal {
	public void save(Accountlist entity);

	public void delete(Accountlist entity);

	public Accountlist update(Accountlist entity);

	public Accountlist findById(Integer id);

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

	public List<Accountlist> findAll();
	public List<Accountlist> findList(String name);
}