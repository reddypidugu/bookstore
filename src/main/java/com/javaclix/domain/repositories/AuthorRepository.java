package com.javaclix.domain.repositories;

import com.javaclix.domain.entities.Author;
import com.javaclix.domain.entities.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "authors", path = "authors")
public interface AuthorRepository extends MongoRepository<Author, String> {
    Author findOneByBooks(Book book);
}