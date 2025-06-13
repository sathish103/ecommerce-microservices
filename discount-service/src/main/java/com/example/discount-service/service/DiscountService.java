package com.example.discountservice.service;

import com.example.discountservice.entity.Discount;
import com.example.discountservice.repository.DiscountRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DiscountService {

    private final DiscountRepository discountRepository;

    public DiscountService(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }

    public Discount createOrUpdateDiscount(Discount discount) {
        return discountRepository.save(discount);
    }

    public Discount getActiveDiscountByProductId(Long productId) {
        return discountRepository.findByProductId(productId)
            .filter(d -> d.getStartDate().isBefore(LocalDateTime.now()) &&
                         d.getEndDate().isAfter(LocalDateTime.now()))
            .orElse(null);
    }
}
