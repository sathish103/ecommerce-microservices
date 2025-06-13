package com.example.discountservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "discounts")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private String type; // FLAT or PERCENTAGE
    private double value;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    // Getters and Setters
}
