package com.BookingSystem.BookingSystem.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import com.BookingSystem.BookingSystem.model.Admin;

@Entity
@Data
@NoArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    /**
     * dateOfRequest is the date of when the client made the booking request.
     * dateOfBooking is the date of when the client wants the booking
     */
    public Date dateOfRequest, dateOfBooking;

    /**
     * The admin this appointment is associated with.
     */
    @OneToOne
    public Admin admin;

    /**
     * The client who created this appointment.
     */
    @OneToOne
    public Client client;
}
