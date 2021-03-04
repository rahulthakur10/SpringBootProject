package com.authorbook.springboot.repositories;

import com.authorbook.springboot.domain.Author;
import org.springframework.data.repository.CrudRepository;


/*
CREATED ON 03/03/21
 */

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
