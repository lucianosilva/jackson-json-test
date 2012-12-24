/**
 * Copyright (C) IT Convergence.  All rights reserved.
 * IT Convergence - http://www.itconvergence.com
 */
package com.blog.lucianosilva.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author luciano
 *
 */
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3952627302919853598L;

	private String title;
	private Integer year;
	private List<Isbn> ISBN;
	private List<Genre> genres;
	private List<Author> authors;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
		this.year = year;
	}
	/**
	 * @return the iSBN
	 */
	public List<Isbn> getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(List<Isbn> iSBN) {
		ISBN = iSBN;
	}
	/**
	 * @return the genres
	 */
	public List<Genre> getGenres() {
		return genres;
	}
	/**
	 * @param genres the genres to set
	 */
	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}
	/**
	 * @return the authors
	 */
	public List<Author> getAuthors() {
		return authors;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
}
