package com.x1a0ch1.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Accountlist entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "accountlist", catalog = "new_db", uniqueConstraints = @UniqueConstraint(columnNames = "account"))
public class Accountlist implements java.io.Serializable {

	// Fields
	private Integer id;
	private String accountType;
	private String account;
	private String password;
	private String name;
	private String cardNum;
	private String cardType;
	private Timestamp expDate;
	private String address;
	private String zip;
	private Double cardCash;
	// Constructors

	/** default constructor */
	public Accountlist() {
	}

	/** minimal constructor */
	public Accountlist(String account, String password, String name,
			String cardNum, String address) {
		this.account = account;
		this.password = password;
		this.name = name;
		this.cardNum = cardNum;
		this.address = address;
		this.cardCash=(double)0;
	}

	/** full constructor */
	public Accountlist(String accountType, String account, String password,
			String name, String cardNum, String cardType, Timestamp expDate,
			String address, String zip, Double cardCash) {
		this.accountType = accountType;
		this.account = account;
		this.password = password;
		this.name = name;
		this.cardNum = cardNum;
		this.cardType = cardType;
		this.expDate = expDate;
		this.address = address;
		this.zip = zip;
		this.cardCash = cardCash;
	}
	public Accountlist(String accountType, String account, String password,
			String name,String cardType, String cardNum, 
			String address, String zip) {
		this.accountType = accountType;
		this.account = account;
		this.password = password;
		this.name = name;
		this.cardNum = cardNum;
		this.cardType = cardType;
		this.address = address;
		this.zip = zip;
		this.cardCash = (double) 0;
		this.expDate=new Timestamp(System.currentTimeMillis());
	}


	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "accountType", length = 20)
	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Column(name = "account", unique = true, nullable = false, length = 20)
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "password", nullable = false, length = 20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "cardNum", nullable = false, length = 20)
	public String getCardNum() {
		return this.cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	@Column(name = "cardType")
	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	@Column(name = "expDate", length = 19)
	public Timestamp getExpDate() {
		return this.expDate;
	}

	public void setExpDate(Timestamp expDate) {
		this.expDate = expDate;
	}

	@Column(name = "address", nullable = false)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "zip", length = 6)
	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Column(name = "cardCash", precision = 15)
	public Double getCardCash() {
		return this.cardCash;
	}

	public void setCardCash(Double cardCash) {
		this.cardCash = cardCash;
	}

}