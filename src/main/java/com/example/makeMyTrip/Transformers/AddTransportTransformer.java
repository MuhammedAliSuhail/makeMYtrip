package com.example.makeMyTrip.Transformers;

import com.example.makeMyTrip.DTOS.RequestDTO.AddTransportDTO;
import com.example.makeMyTrip.DTOS.ResponseDto.FlightDTO;
import com.example.makeMyTrip.Entites.Transport;

public class AddTransportTransformer {


    public static Transport addTransformer(AddTransportDTO addTransportDTO){

        Transport tarnsport=Transport.builder().modeoftransport(addTransportDTO.getModeoftransport())
                .CmpanyName(addTransportDTO.getCmpanyName()).journyDate(addTransportDTO.getJournyDate())
                .journyTime(addTransportDTO.getJournyStarts()).journystrats(addTransportDTO.getJournyTime1())
                .build();

        return tarnsport;
    }


    public static FlightDTO EntityToDTO(Transport transport){

        return FlightDTO.builder().journyTime(transport.getJournyTime()).journyDate(transport.getJournyDate())
                .journystrats(transport.getJournystrats()).CmpanyName(transport.getCmpanyName()).build();
    }
}
