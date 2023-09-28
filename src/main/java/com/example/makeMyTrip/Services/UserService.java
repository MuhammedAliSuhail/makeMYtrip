package com.example.makeMyTrip.Services;


import com.example.makeMyTrip.DTOS.RequestDTO.addUserDTO;
import com.example.makeMyTrip.Entites.Users;
import com.example.makeMyTrip.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class UserService {

@Autowired
    UserRepository userRepository;

@Autowired
JavaMailSender javaMailSender;

    public String AddUser(addUserDTO addUserDTO){
        Users users=Users.builder().userName(addUserDTO.getUserName()).
         emailId(addUserDTO.getEmail()).age(addUserDTO.getAge()).build();


 userRepository.save(users);
        SimpleMailMessage mailMessage = new SimpleMailMessage();

        String body = "Hi! "+users.getUserName()+"\n" +
                "Welcome to Make your Trip Website. Book your flights, buses and trains conviniently here";
         mailMessage.setSubject("Welcome to MakeMyTrip");
         mailMessage.setFrom("oo7suahil@gmail.com");
         mailMessage.setTo(users.getEmailId());
         mailMessage.setText(body);

  javaMailSender.send(mailMessage);
 return "User has been saved successfully";
    }
}
