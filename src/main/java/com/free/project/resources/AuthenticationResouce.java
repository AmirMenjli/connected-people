package com.free.project.resources;

import com.free.project.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class AuthenticationResouce {
//    @RequestMapping("/")
//    public String index() {
//        return "Connected People!";
//
//    }

    @GetMapping("/authenticate")
    public ResponseEntity<User> authenticateUser(){

        User user = new User();
        user.setId(1);
        user.setFirstName("Amir");
        return new ResponseEntity<>(user, null, HttpStatus.OK);
    }

}

