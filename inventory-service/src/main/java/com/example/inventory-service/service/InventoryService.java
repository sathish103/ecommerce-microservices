package com.example.inventoryservice.service;

import com.example.inventoryservice.entity.InventoryItem;
import com.example.inventoryservice.repository.InventoryItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    private final InventoryItemRepository inventoryItemRepository;

    public InventoryService(InventoryItemRepository inventoryItemRepository) {
        this.inventoryItemRepository = inventoryItemRepository;
    }

    public InventoryItem addItem(InventoryItem item) {
        return inventoryItemRepository.save(item);
    }

    public List<InventoryItem> getItemsByWarehouse(String warehouseName) {
        return inventoryItemRepository.findByInventoryWarehouseName(warehouseName);
    }

    public void removeItem(Long itemId) {
        inventoryItemRepository.deleteById(itemId);
    }
}
