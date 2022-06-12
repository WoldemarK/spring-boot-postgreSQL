package com.example.springbootpostgresql.repository;

import com.example.springbootpostgresql.model.Book;
import com.example.springbootpostgresql.model.Lend;
import com.example.springbootpostgresql.model.LendStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LendRepository extends JpaRepository<Lend, Long> {

    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}
