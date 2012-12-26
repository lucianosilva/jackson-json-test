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
import org.codehaus.jackson.map.SerializationConfig;

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
		
		logger.info("Teste para simular a conversao de objetos Java para o formato json.");

		// Jackson Object Mapper
		//
		ObjectMapper mapper = new ObjectMapper();
		
		// configura a formatacao do json para impressao com identacao
		mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);

		//
		// Cria os Objetos e Popula manualmente
		//
		
		// ISBN
		List<Isbn> isbn = new ArrayList<Isbn>();
		isbn.add( new Isbn("0-00-225010-1") );
		isbn.add( new Isbn("0-00-649035-2") );

		// Autores
		List<Author> authors = new ArrayList();
		authors.add( new Author("Cornwell", "Bernard", 68, Sex.MALE) );

		// Generos
		List<Genre> genres = new ArrayList();
		genres.add( new Genre("Historical Fantasy") );
		genres.add( new Genre("Fantasy") );

		// Livro
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
			logger.error(e);
		} catch (JsonMappingException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		}

	}

}