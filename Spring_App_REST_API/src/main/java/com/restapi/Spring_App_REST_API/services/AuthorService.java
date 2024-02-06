package com.restapi.Spring_App_REST_API.services;

import com.restapi.Spring_App_REST_API.domain.entities.AuthorEntity;

public interface AuthorService {
    AuthorEntity save(AuthorEntity authorEntity);
}
