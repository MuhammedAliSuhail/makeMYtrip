package com.example.makeMyTrip.DTOS.RequestDTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class addUserDTO {



    private String UserName;

    private String email;

    private Integer age;




}
