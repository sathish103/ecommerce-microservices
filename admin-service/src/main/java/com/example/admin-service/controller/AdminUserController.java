package com.example.adminservice.controller;

import com.example.adminservice.entity.AdminUser;
import com.example.adminservice.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminUserController {

    @Autowired
    private AdminUserService service;

    @PostMapping
    public AdminUser createAdminUser(@RequestBody AdminUser user) {
        return service.createAdminUser(user);
    }

    @GetMapping
    public List<AdminUser> getAllAdminUsers() {
        return service.getAllAdminUsers();
    }
}
