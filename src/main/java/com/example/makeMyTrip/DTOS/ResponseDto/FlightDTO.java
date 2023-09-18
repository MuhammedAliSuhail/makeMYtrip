package com.example.makeMyTrip.DTOS.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightDTO {

    private LocalDate journyDate;
    private LocalTime journyTime;

    private String CmpanyName;

    private double journystrats;
    private String stopeInBetween;
}
