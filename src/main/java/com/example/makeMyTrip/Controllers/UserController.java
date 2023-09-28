package com.example.makeMyTrip.Controllers;


import com.example.makeMyTrip.DTOS.RequestDTO.addUserDTO;
import com.example.makeMyTrip.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String AddUser(@RequestBody addUserDTO addUserDTO){


        return userService.AddUser(addUserDTO);

    }
}
