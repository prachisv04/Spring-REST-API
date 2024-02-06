package com.restapi.Spring_App_REST_API.repositories;

import com.restapi.Spring_App_REST_API.domain.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, String> {
}
