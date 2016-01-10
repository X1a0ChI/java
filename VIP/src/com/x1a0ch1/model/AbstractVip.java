package com.x1a0ch1.model;

import java.sql.Timestamp;

/**
 * AbstractVip entity provides the base persistence definition of the Vip
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVip implements java.io.Serializable {

	// Fields

	private String vipId;
	private Timestamp joinTime;
	private String name;
	private Integer age;
	private String profession;

	// Constructors

	/** default constructor */
	public AbstractVip() {
	}

	/** full constructor */
	public AbstractVip(String vipId, Timestamp joinTime, String name,
			Integer age, String profession) {
		this.vipId = vipId;
		this.joinTime = joinTime;
		this.name = name;
		this.age = age;
		this.profession = profession;
	}

	// Property accessors

	public String getVipId() {
		return this.vipId;
	}

	public void setVipId(String vipId) {
		this.vipId = vipId;
	}

	public Timestamp getJoinTime() {
		return this.joinTime;
	}

	public void setJoinTime(Timestamp joinTime) {
		this.joinTime = joinTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}