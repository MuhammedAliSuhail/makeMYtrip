package com.example.makeMyTrip.Services;

import com.example.makeMyTrip.DTOS.RequestDTO.AddRouteDTO;
import com.example.makeMyTrip.Entites.Routes;
import com.example.makeMyTrip.Repositorys.RouteRepository;
import com.example.makeMyTrip.Transformers.AddRouteTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteServices {
@Autowired
    RouteRepository routeRepository;
public String AddRoutes(AddRouteDTO addRouteDTO){
    Routes routes= AddRouteTransformer.AddRouteDTOtoRoutes(addRouteDTO);
    routeRepository.save(routes);

    return "Succssfully saved to the DB. ";


}
}
