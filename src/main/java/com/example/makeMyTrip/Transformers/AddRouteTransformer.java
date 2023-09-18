package com.example.makeMyTrip.Transformers;

import com.example.makeMyTrip.DTOS.RequestDTO.AddRouteDTO;
import com.example.makeMyTrip.Entites.Routes;

public class AddRouteTransformer {

    public static Routes AddRouteDTOtoRoutes(AddRouteDTO addRouteDTO){

        Routes routeObject=Routes.builder().fromCity(addRouteDTO.getFromCity())
                .toCity(addRouteDTO.getTocity())
                .stopeInBetween(addRouteDTO.getStopInBetween())
                .modeOfTransport(addRouteDTO.getModeOfTransport())
                .build();

        return routeObject;
    }
}
