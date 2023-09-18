package com.example.makeMyTrip.Services;

import com.example.makeMyTrip.DTOS.RequestDTO.addFlightseatsDTO;
import com.example.makeMyTrip.Entites.Seats;
import com.example.makeMyTrip.Entites.Transport;
import com.example.makeMyTrip.Enums.seatType;
import com.example.makeMyTrip.Repositorys.SeatRepository;
import com.example.makeMyTrip.Repositorys.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeatServices {
@Autowired
private SeatRepository seatRepository;

@Autowired
private TransportRepository transportRepository;
public String addSeat(addFlightseatsDTO  addFlightseatsDTO) {

//    Transport T = transportRepository.findById(addFlightseatsDTO.getTransportId()).get();
//
//
//    for (int i = 0; i < addFlightseatsDTO.getNoOfEconamySeats(); i++) {
//        Seats seat = Seats.builder().SeatNo(String.valueOf(i)).seattype(seatType.Econamy)
//                .price(addFlightseatsDTO.getPriceOfEconnamySeat()).transport(T).build();
//
//        T.getSeatList().add(seat);
//
//    }
//
//
//    for (int i = 0; i < addFlightseatsDTO.getNoOFBussinesSeats(); i++) {
//        Seats seat = Seats.builder().SeatNo(String.valueOf(i)).seattype(seatType.Buissnes)
//                .price(addFlightseatsDTO.getPriceOfBusinessSeat()).transport(T).build();
//        T.getSeatList().add(seat);
//    }
//transportRepository.save(T);
    return "seats save succssfully";
}

}
