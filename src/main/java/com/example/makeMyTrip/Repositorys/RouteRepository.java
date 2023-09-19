package com.example.makeMyTrip.Repositorys;

import com.example.makeMyTrip.Entites.Routes;
import com.example.makeMyTrip.Enums.Citys;
import com.example.makeMyTrip.Enums.ModeOfTransport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<Routes,Integer> {

    List<Routes> findRoutesByFromCityAndToCityAndModeOfTransport(
            Citys fromCity,
            Citys toCity,
            ModeOfTransport modeOfTransport
    );

}
