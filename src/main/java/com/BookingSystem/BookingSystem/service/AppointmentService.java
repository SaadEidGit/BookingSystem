package com.BookingSystem.BookingSystem.service;

import com.BookingSystem.BookingSystem.model.Appointment;
import com.BookingSystem.BookingSystem.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AppointmentService {

    public AppointmentRepository appointmentRepository;

    public Appointment saveAppointment(Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    public void deleteAppointment(Appointment appointment){
        appointmentRepository.deleteById(appointment.getId());
    }
}
