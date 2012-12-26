/**
 * Copyright (C) IT Convergence.  All rights reserved.
 * IT Convergence - http://www.itconvergence.com
 */
package com.blog.lucianosilva;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.blog.lucianosilva.bean.Author;
import com.blog.lucianosilva.bean.Book;
import com.blog.lucianosilva.bean.Genre;
import com.blog.lucianosilva.bean.Isbn;

/**
 * @author luciano
 *
 */
public class JacksonReaderTesting {

	private static final Logger logger = Logger.getLogger(JacksonReaderTesting.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		logger.info("Teste para simular a conversao de json para Java objects.");

		// Jackson Object Mapper
		//
		ObjectMapper mapper = new ObjectMapper();

		try {

			Book book = null;

			logger.info("Carrega o arquivo book.json do diretorio resources");

			//
			//
			URL resource = JacksonReaderTesting.class.getClassLoader().getResource("book.json");

			//
			if( resource!=null ){
				//
				//
				File f = new File( resource.getFile() );
				
				logger.info("O Jackson faz todo o trabalho e converte para o Java utilizando inclusive tipos complexos.");
				
				//
				// O Jackson faz todo o trabalho e converte para o Java utilizando inclusive tipos complexos.
				book = mapper.readValue(f, Book.class);

				logger.info("Title : ");
				logger.info( "  " + book.getTitle());

				logger.info("Year : ");
				logger.info( "  " + book.getYear());

				logger.info("ISBN : ");
				for ( Isbn isbn : book.getISBN() ) {
					logger.info("  " + isbn.getCode() );
				}

				logger.info("Genre : ");
				for (Genre g : book.getGenres() ) {
					logger.info("  " + g.getName() );
				}

				logger.info("Author : ");
				for (Author author : book.getAuthors()) {
					logger.info("  " + author.getLastName() + ", " + author.getFirstName() );
				}
				
				//
				//
			}

		} catch (JsonParseException e) {
			logger.error(e);
		} catch (JsonMappingException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		}

	}

}
