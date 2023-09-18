package com.example.makeMyTrip.DTOS.RequestDTO;

import com.example.makeMyTrip.Enums.ModeOfTransport;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
public class AddTransportDTO {

    private ModeOfTransport modeoftransport;

    private LocalDate journyDate;
    private LocalTime journyTime;

    private String CmpanyName;

    private double journystrats;
}
