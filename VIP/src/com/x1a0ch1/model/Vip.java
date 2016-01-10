package com.x1a0ch1.model;

import java.sql.Timestamp;

/**
 * Vip entity. @author MyEclipse Persistence Tools
 */
public class Vip extends AbstractVip implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Vip() {
	}

	/** full constructor */
	public Vip(String vipId, Timestamp joinTime, String name, Integer age,
			String profession) {
		super(vipId, joinTime, name, age, profession);
	}

}
