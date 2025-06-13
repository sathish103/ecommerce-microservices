package com.example.searchservice.controller;

import com.example.searchservice.entity.Product;
import com.example.searchservice.service.SearchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping
    public List<Product> search(@RequestParam String keyword) {
        return searchService.search(keyword);
    }

    @PostMapping("/index")
    public Product index(@RequestBody Product product) {
        return searchService.indexProduct(product);
    }
}
