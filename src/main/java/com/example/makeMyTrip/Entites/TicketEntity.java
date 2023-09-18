package com.example.makeMyTrip.Entites;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "ticket")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer ticketId;

    private String routeDetails;
    private LocalDate journyDate;
    private LocalTime journyStartTime;

    private Integer costPaid;
    private String seatNo;

    @OneToOne
    @JoinColumn
    private Bookings bookings;
}
