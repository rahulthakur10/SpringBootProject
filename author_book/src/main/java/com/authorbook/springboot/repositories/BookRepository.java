package com.authorbook.springboot.repositories;

import com.authorbook.springboot.domain.Book;
import org.springframework.data.repository.CrudRepository;


/*
CREATED ON 03/03/21
 */

public interface BookRepository extends CrudRepository<Book,Long> {
}
