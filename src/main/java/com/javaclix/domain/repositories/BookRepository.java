package com.javaclix.domain.repositories;

import com.javaclix.domain.entities.Book;
import com.javaclix.domain.entities.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByCategory(Category category);
}