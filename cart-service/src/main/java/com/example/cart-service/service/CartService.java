package com.example.cartservice.service;

import com.example.cartservice.entity.Cart;
import com.example.cartservice.entity.CartItem;
import com.example.cartservice.repository.CartItemRepository;
import com.example.cartservice.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartItemRepository cartItemRepository;
    private final CartRepository cartRepository;

    public CartService(CartItemRepository cartItemRepository, CartRepository cartRepository) {
        this.cartItemRepository = cartItemRepository;
        this.cartRepository = cartRepository;
    }

    public CartItem addItem(CartItem item) {
        Long userId = item.getUserId();
        Cart cart = cartRepository.findByUserId(userId);

        if (cart == null) {
            cart = new Cart();
            cart.setUserId(userId);
            cart = cartRepository.save(cart);
        }

        item.setCart(cart);
        return cartItemRepository.save(item);
    }

    public List<CartItem> getUserCart(Long userId) {
        return cartItemRepository.findByCartUserId(userId);
    }

    public void removeItem(Long itemId) {
        cartItemRepository.deleteById(itemId);
    }
}
