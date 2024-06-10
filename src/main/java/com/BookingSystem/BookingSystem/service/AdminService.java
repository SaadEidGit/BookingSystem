package com.BookingSystem.BookingSystem.service;

import com.BookingSystem.BookingSystem.model.Admin;
import com.BookingSystem.BookingSystem.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {

    private AdminRepository adminRepository;

    public Admin saveAdmin(Admin admin){
        return adminRepository.save(admin);
    }

    public Optional<Admin> getAdminById(Long id){
        return adminRepository.findById(id);
    }

    public void deleteAdmin(Admin admin){
        adminRepository.deleteById(admin.getId());
    }
}
