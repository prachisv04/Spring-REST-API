package com.restapi.Spring_App_REST_API;

import com.restapi.Spring_App_REST_API.domain.dto.AuthorDto;
import com.restapi.Spring_App_REST_API.domain.entities.AuthorEntity;
import com.restapi.Spring_App_REST_API.domain.entities.BookEntity;

public class TestDataUtils {
    TestDataUtils(){
    }

    public static AuthorEntity createTestAuthorEntityA() {
        return AuthorEntity.builder()
                .id(1L)
                .name("Chetan Bhagar")
                .age(35)
                .build();
    }

    public static AuthorDto createTestAuthorDtoA() {
        return AuthorDto.builder()
                .id(2L)
                .name("Priyanka chopra")
                .age(40)
                .build();
    }

    public static AuthorEntity createTestAuthorB() {
        return AuthorEntity.builder()
                .id(3L)
                .name("P.L.Deshpande")
                .age(80)
                .build();
    }

    public static AuthorEntity createTestAuthorC() {
        return AuthorEntity.builder()
                .id(4L)
                .name("J Sai Deepak")
                .age(39)
                .build();
    }

    public static BookEntity createTestBookEntityA(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-0")
                .title("Unfinished")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookEntity createTestBookB(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-1")
                .title("The girl in room 105")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookEntity createTestBookC(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-2")
                .title("India That is Bharat")
                .authorEntity(authorEntity)
                .build();
    }
}
