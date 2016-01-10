package com.x1a0ch1.model;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
public class Student extends AbstractStudent implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(String id, String name, String subject, Double result) {
		super(id, name, subject, result);
	}

}
