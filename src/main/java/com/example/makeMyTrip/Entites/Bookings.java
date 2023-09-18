package com.example.makeMyTrip.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "bookings")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bookings {

    @Id
    private Integer bookingId;

    private String seatNo;

    private Date JournyDate;
    private Integer TransportId;



    @ManyToOne
    @JoinColumn
    private Transport transport;

    @OneToOne(mappedBy = "bookings",cascade = CascadeType.ALL)
    private TicketEntity ticketEntity;

    @ManyToOne
    @JoinColumn
    private Users users;

}
