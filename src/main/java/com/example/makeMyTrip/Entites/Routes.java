package com.example.makeMyTrip.Entites;

import com.example.makeMyTrip.Enums.Citys;
import com.example.makeMyTrip.Enums.ModeOfTransport;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "routes")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Routes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer routeId;
@Enumerated(EnumType.STRING)
    private Citys fromCity;

@Enumerated(EnumType.STRING)
    private Citys toCity;

    private String stopeInBetween;


    @Enumerated(EnumType.STRING)
    private ModeOfTransport modeOfTransport;




    @OneToMany(mappedBy = "routes",cascade = CascadeType.ALL)
    List<Transport> transportList=new ArrayList<>();

}
