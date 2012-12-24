/**
 * Copyright (C) IT Convergence.  All rights reserved.
 * IT Convergence - http://www.itconvergence.com
 */
package com.blog.lucianosilva;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.blog.lucianosilva.bean.Author;
import com.blog.lucianosilva.bean.Book;
import com.blog.lucianosilva.bean.Genre;
import com.blog.lucianosilva.bean.Isbn;
import com.blog.lucianosilva.type.Sex;

/**
 * @author luciano
 *
 */
public class JacksonTesting {

	private static final Logger logger = Logger.getLogger(JacksonTesting.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Jackson Object Mapper
		//
		ObjectMapper mapper = new ObjectMapper();
		
		//
		List<Isbn> isbn = new ArrayList<Isbn>();
		isbn.add( new Isbn("0-00-225010-1") );
		isbn.add( new Isbn("0-00-649035-2") );

		//
		List<Author> authors = new ArrayList();
		authors.add( new Author("Cornwell", "Bernard", 68, Sex.MALE) );

		//
		List<Genre> genres = new ArrayList();
		genres.add( new Genre("Historical Fantasy") );

		//
		Book book = new Book();
		book.setTitle("Sharpe's Tiger");
		book.setYear(1997);
		book.setISBN( isbn );
		book.setAuthors( authors );
		book.setGenres( genres );

		try {
			
			String jsonFormatted = mapper.writeValueAsString(book);
			logger.debug(jsonFormatted);
			
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
