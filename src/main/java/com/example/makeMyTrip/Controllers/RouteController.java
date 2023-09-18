package com.example.makeMyTrip.Controllers;

import com.example.makeMyTrip.DTOS.RequestDTO.AddRouteDTO;
import com.example.makeMyTrip.Services.RouteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/route")
public class RouteController {
@Autowired
    RouteServices routeServices;
    @PostMapping("/add")
    public String AddRoute(@RequestBody AddRouteDTO addRoute){

        return routeServices.AddRoutes(addRoute);
    }
}
