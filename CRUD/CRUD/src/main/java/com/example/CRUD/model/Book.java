package com.example.CRUD.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="BOOKS")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String author;

}
