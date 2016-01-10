package com.x1a0ch1.model;

/**
 * AbstractStudent entity provides the base persistence definition of the
 * Student entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStudent implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String subject;
	private Double result;

	// Constructors

	/** default constructor */
	public AbstractStudent() {
	}

	/** full constructor */
	public AbstractStudent(String id, String name, String subject, Double result) {
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.result = result;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Double getResult() {
		return this.result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

}