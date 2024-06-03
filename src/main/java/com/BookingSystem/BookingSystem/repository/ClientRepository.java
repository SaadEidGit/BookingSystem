package com.BookingSystem.BookingSystem.repository;

import com.BookingSystem.BookingSystem.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
