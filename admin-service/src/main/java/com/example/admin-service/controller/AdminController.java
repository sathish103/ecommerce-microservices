package com.example.adminservice.controller;

import com.example.adminservice.entity.AdminUser;
import com.example.adminservice.service.AdminUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/users")
public class AdminUserController {

    private final AdminUserService adminUserService;

    public AdminUserController(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }

    @PostMapping
    public AdminUser create(@RequestBody AdminUser adminUser) {
        return adminUserService.createAdmin(adminUser);
    }

    @GetMapping
    public List<AdminUser> getAll() {
        return adminUserService.getAllAdmins();
    }

    @GetMapping("/{username}")
    public AdminUser getByUsername(@PathVariable String username) {
        return adminUserService.getByUsername(username);
    }
}
