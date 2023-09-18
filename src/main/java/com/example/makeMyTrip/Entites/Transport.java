package com.example.makeMyTrip.Entites;

import com.example.makeMyTrip.Enums.ModeOfTransport;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "transport")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transport {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer TransportId;

  private ModeOfTransport modeoftransport;

  private LocalDate journyDate;
  private LocalTime journyTime;

  private String CmpanyName;

  private double journystrats;
    @ManyToOne
    @JoinColumn
    private  Routes routes;

    @OneToMany(mappedBy = "transport",cascade = CascadeType.ALL)
  List<Seats> seatList=new ArrayList<>();


    @OneToMany(mappedBy = "transport",cascade = CascadeType.ALL)
  List<Bookings> BookingList=new ArrayList<>();

}
