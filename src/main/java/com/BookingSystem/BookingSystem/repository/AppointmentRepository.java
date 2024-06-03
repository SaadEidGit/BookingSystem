package com.BookingSystem.BookingSystem.repository;

import com.BookingSystem.BookingSystem.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
}
