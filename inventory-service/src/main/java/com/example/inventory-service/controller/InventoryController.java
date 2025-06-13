package com.example.inventoryservice.controller;

import com.example.inventoryservice.entity.InventoryItem;
import com.example.inventoryservice.service.InventoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping
    public InventoryItem addOrUpdate(@RequestBody InventoryItem item) {
        return inventoryService.addOrUpdateItem(item);
    }

    @GetMapping("/{productId}")
    public InventoryItem getInventory(@PathVariable Long productId) {
        return inventoryService.getByProductId(productId);
    }

    @GetMapping("/check/{productId}/{quantity}")
    public boolean checkStock(@PathVariable Long productId, @PathVariable int quantity) {
        return inventoryService.isInStock(productId, quantity);
    }
}
