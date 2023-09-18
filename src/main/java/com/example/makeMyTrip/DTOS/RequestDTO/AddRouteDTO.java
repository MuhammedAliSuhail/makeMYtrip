package com.example.makeMyTrip.DTOS.RequestDTO;

import com.example.makeMyTrip.Enums.Citys;
import com.example.makeMyTrip.Enums.ModeOfTransport;
import lombok.Data;

@Data
public class AddRouteDTO {
    private Citys fromCity;
    private Citys Tocity;
    private String StopInBetween;

    private ModeOfTransport modeOfTransport;
}
