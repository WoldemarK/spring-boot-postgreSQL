package com.example.springbootpostgresql.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "author")
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @JsonBackReference
    @OneToMany(mappedBy = "author",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Book> books;
}
