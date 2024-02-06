package com.restapi.Spring_App_REST_API.services.Impl;

import com.restapi.Spring_App_REST_API.domain.entities.AuthorEntity;
import com.restapi.Spring_App_REST_API.repositories.AuthorRepository;
import com.restapi.Spring_App_REST_API.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity save(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }
}
