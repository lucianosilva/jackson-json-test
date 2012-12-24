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
public class Genre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7967483112987975236L;

	private String name;

	public Genre() {}
	
	public Genre(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
