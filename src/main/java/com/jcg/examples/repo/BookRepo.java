package com.jcg.examples.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.solr.repository.Query;

import com.jcg.examples.entity.Book;

public interface BookRepo extends CrudRepository<Book, Long>
{

		@Query("title:?0")
		public Book findByBookTitle(String name);
		
}
