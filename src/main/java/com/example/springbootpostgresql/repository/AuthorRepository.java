package com.example.springbootpostgresql.repository;

import com.example.springbootpostgresql.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
