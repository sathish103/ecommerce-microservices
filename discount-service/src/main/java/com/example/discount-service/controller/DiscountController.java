package com.example.discountservice.controller;

import com.example.discountservice.entity.Discount;
import com.example.discountservice.service.DiscountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/discounts")
public class DiscountController {

    private final DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @PostMapping
    public Discount createOrUpdate(@RequestBody Discount discount) {
        return discountService.createOrUpdateDiscount(discount);
    }

    @GetMapping("/product/{productId}")
    public Discount getDiscount(@PathVariable Long productId) {
        return discountService.getActiveDiscountByProductId(productId);
    }
}
