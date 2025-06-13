package com.example.discountservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "discounts")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private double percentage;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private Long productId;

    public Discount() {}

    // Getters
    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public double getPercentage() {
        return percentage;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Long getProductId() {
        return productId;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
