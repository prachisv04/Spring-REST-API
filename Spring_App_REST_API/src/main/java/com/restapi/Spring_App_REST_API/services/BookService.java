package com.restapi.Spring_App_REST_API.services;

import com.restapi.Spring_App_REST_API.domain.entities.BookEntity;

public interface BookService {
    BookEntity createBook(String isbn, BookEntity book);
}
