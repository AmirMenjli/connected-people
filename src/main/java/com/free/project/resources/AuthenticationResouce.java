package com.free.project.resources;

import com.free.project.dto.UserDTO;
import com.free.project.entities.User;
import com.free.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class AuthenticationResouce {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/authenticate")
    public ResponseEntity<User> authenticateUser(){

        User user = new User();
        user.setId(1);
        user.setFirstName("Amir");
        return new ResponseEntity<>(user, null, HttpStatus.OK);
    }


    @PostMapping("/create")
    public User create(@RequestBody UserDTO users){

        User user =new User();
        user.setId(1);
        user.setFirstName("Amir");
        user.setLastName("MENJLI");

        return userRepository.save(user);
    }

    @GetMapping("/find")
    public Optional<User> find(){

        return userRepository.findById(1L);
    }
}

