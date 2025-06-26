package com.example.discountservice.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

@Entity
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private double discountPercentage;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    public Discount() {
    }

    public Discount(Long productId, double discountPercentage, LocalDate startDate, LocalDate endDate) {
        this.productId = productId;
        this.discountPercentage = discountPercentage;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    // 🔥 Add these methods to fix service call issues

    public String getCode() {
        return "DISCOUNT" + id; // placeholder, or make code a field if needed
    }

    public double getPercentage() {
        return this.discountPercentage;
    }

    public boolean isActive() {
        LocalDate today = LocalDate.now();
        return (startDate != null && endDate != null)
                && !today.isBefore(startDate)
                && !today.isAfter(endDate);
    }
}
