/**
 * Copyright (C) IT Convergence.  All rights reserved.
 * IT Convergence - http://www.itconvergence.com
 */
package com.blog.lucianosilva.bean;

import java.io.Serializable;

import com.blog.lucianosilva.type.Sex;

/**
 * @author luciano
 *
 */
public class Author implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1338952586507467168L;

	private String lastName;
	private String firstName;
	private Integer age;
	private Sex sex;
	
	public Author(){}

	public Author(String lastName, String firstName, Integer age, Sex sex) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.sex = sex;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the sex
	 */
	public Sex getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(Sex sex) {
		this.sex = sex;
	}

	
}
