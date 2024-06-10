package com.BookingSystem.BookingSystem.controller;

import com.BookingSystem.BookingSystem.model.Admin;
import com.BookingSystem.BookingSystem.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/Admin")
@CrossOrigin(origins = "*")
public class AdminController {

    private final AdminService adminService;

    @PostMapping("/addAdmin")
    public Admin addAdmin(@RequestBody Admin admin){
        return adminService.saveAdmin(admin);
    }

    @GetMapping("/getAdmin/{id}")
    public Optional<Admin> getAdminById(@PathVariable Long id){
        return adminService.getAdminById(id);
    }

    @PostMapping("/deleteAdmin")
    public ResponseEntity<Void> deleteAdmin(@RequestBody Admin admin){
        adminService.deleteAdmin(admin);
        return ResponseEntity.noContent().build();
    }
}
