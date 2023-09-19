package com.example.makeMyTrip.Services;

import com.example.makeMyTrip.DTOS.RequestDTO.SearchFlightDTO;
import com.example.makeMyTrip.DTOS.ResponseDto.FlightDTO;
import com.example.makeMyTrip.Entites.Routes;
import com.example.makeMyTrip.Entites.Transport;
import com.example.makeMyTrip.Repositorys.RouteRepository;
import com.example.makeMyTrip.Repositorys.TransportRepository;
import com.example.makeMyTrip.Transformers.AddTransportTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransportService {
@Autowired
    TransportRepository transportRepository;

@Autowired
    RouteRepository routeRepository;


    public List<FlightDTO> SerachResult(SearchFlightDTO searchFlightDTO){
    List<FlightDTO> flightDTOS=new ArrayList<>();

    List<Routes>routes=routeRepository.findRoutesByFromCityAndToCityAndModeOfTransport(searchFlightDTO.getFromCity(),searchFlightDTO.getToCity(),searchFlightDTO.getModeOfTransport());
      for(Routes routes1:routes){

          List<Transport> transports=routes1.getTransportList();

          for(Transport transport:transports){
              if(transport.getJournyDate().equals(searchFlightDTO.getJournyDate())){

                  FlightDTO result= AddTransportTransformer.EntityToDTO(transport);
                  result.setStopeInBetween(routes1.getStopeInBetween());
                  flightDTOS.add(result);
              }
          }


      }
        return flightDTOS;
    }
}
