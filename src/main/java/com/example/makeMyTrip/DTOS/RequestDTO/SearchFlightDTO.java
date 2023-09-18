package com.example.makeMyTrip.DTOS.RequestDTO;

import com.example.makeMyTrip.Enums.Citys;
import com.example.makeMyTrip.Enums.ModeOfTransport;
import lombok.Data;

import java.time.LocalDate;
@Data
public class SearchFlightDTO {

    private Citys fromCity;
    private Citys toCity;
    private LocalDate JournyDate;

    private ModeOfTransport modeOfTransport;

}
