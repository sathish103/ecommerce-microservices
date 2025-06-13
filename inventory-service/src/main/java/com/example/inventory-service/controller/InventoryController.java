package com.example.inventoryservice.controller;

import com.example.inventoryservice.entity.InventoryItem;
import com.example.inventoryservice.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping
    public InventoryItem addItem(@RequestBody InventoryItem item) {
        return inventoryService.addItem(item);
    }

    @GetMapping("/{warehouseName}")
    public List<InventoryItem> getItems(@PathVariable String warehouseName) {
        return inventoryService.getItemsByWarehouse(warehouseName);
    }

    @DeleteMapping("/{itemId}")
    public void deleteItem(@PathVariable Long itemId) {
        inventoryService.removeItem(itemId);
    }
}
