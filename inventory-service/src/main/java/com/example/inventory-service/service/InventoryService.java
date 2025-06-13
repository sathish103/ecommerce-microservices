package com.example.inventoryservice.service;

import com.example.inventoryservice.entity.InventoryItem;
import com.example.inventoryservice.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public InventoryItem addOrUpdateItem(InventoryItem item) {
        Optional<InventoryItem> existing = inventoryRepository.findByProductId(item.getProductId());
        if (existing.isPresent()) {
            InventoryItem updated = existing.get();
            updated.setQuantity(item.getQuantity());
            return inventoryRepository.save(updated);
        }
        return inventoryRepository.save(item);
    }

    public InventoryItem getByProductId(Long productId) {
        return inventoryRepository.findByProductId(productId).orElse(null);
    }

    public boolean isInStock(Long productId, int quantityNeeded) {
        return inventoryRepository.findByProductId(productId)
                .map(item -> item.getQuantity() >= quantityNeeded)
                .orElse(false);
    }
}
