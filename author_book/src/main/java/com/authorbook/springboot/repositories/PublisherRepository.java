package com.authorbook.springboot.repositories;

import com.authorbook.springboot.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/*

CREATED ON 03/03/21

 */

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
