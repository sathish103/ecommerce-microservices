package com.example.searchservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "search_products")
public class Product {

    @Id
    private Long id;

    private String name;
    private String description;

    // Getters and Setters
}
