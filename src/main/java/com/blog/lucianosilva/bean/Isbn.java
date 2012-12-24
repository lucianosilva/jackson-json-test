/**
 * Copyright (C) IT Convergence.  All rights reserved.
 * IT Convergence - http://www.itconvergence.com
 */
package com.blog.lucianosilva.bean;

import java.io.Serializable;

/**
 * @author luciano
 *
 */
public class Isbn implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8306862972830686729L;

	private String code;

	public Isbn() {
		super();
	}

	/**
	 * 
	 * @param code
	 */
	public Isbn(String code) {
		super();
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	
}
