package com.BookingSystem.BookingSystem.repository;

import com.BookingSystem.BookingSystem.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
}
