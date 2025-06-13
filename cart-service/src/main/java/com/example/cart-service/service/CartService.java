package com.example.cartservice.service;

import com.example.cartservice.entity.CartItem;
import com.example.cartservice.repository.CartItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartItemRepository cartItemRepository;

    public CartService(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    public CartItem addItem(CartItem item) {
        return cartItemRepository.save(item);
    }

    public List<CartItem> getUserCart(Long userId) {
        return cartItemRepository.findByCartUserId(userId);
    }

    public void removeItem(Long itemId) {
        cartItemRepository.deleteById(itemId);
    }
}
