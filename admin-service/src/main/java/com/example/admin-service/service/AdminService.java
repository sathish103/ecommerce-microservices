package com.example.adminservice.service;

import com.example.adminservice.entity.AdminUser;
import com.example.adminservice.repository.AdminUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserService {

    private final AdminUserRepository adminUserRepository;

    public AdminUserService(AdminUserRepository adminUserRepository) {
        this.adminUserRepository = adminUserRepository;
    }

    public AdminUser createAdmin(AdminUser adminUser) {
        return adminUserRepository.save(adminUser);
    }

    public List<AdminUser> getAllAdmins() {
        return adminUserRepository.findAll();
    }

    public AdminUser getByUsername(String username) {
        return adminUserRepository.findByUsername(username);
    }
}
