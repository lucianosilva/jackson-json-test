/**
 * Copyright (C) IT Convergence.  All rights reserved.
 * IT Convergence - http://www.itconvergence.com
 */
package com.blog.lucianosilva.type;

/**
 * @author luciano
 *
 */
public enum Sex {

	MALE("M"), FEMALE("F");
	
	private String value;
	
	/**
	 * 
	 * @param v
	 */
	private Sex( String v ){
		this.value = v;
	}
	
	/**
	 * 
	 * @return
	 */
	public String value(){
		return this.value;
	}
	
}
