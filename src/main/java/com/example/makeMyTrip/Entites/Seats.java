package com.example.makeMyTrip.Entites;

import com.example.makeMyTrip.Enums.seatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "seats")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seats {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seatId;
    private String SeatNo;


    @Enumerated(EnumType.STRING)
    private seatType seattype;
    private Integer price;


    @ManyToOne
    @JoinColumn
    private Transport transport;


}
