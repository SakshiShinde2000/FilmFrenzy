package com.axis.filmfrenzy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.filmfrenzy.dtos.LoginDTO;
import com.axis.filmfrenzy.models.User;
import com.axis.filmfrenzy.services.UserService;

@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UsersController {

	@Autowired private UserService service;

    @PostMapping
    public ResponseEntity<?> registerUser(@RequestBody User user){
        service.saveUser(user);
        return ResponseEntity.ok().body("User registered successfully");
    }
    
    @PostMapping("/validate")
    public ResponseEntity<?> validate(@RequestBody LoginDTO dto){
        User user=service.validate(dto);
        if(user!=null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.badRequest().body("Invalid username or password");
        }
    }

    @GetMapping
    public ResponseEntity<?> listall(){
        return ResponseEntity.ok(service.listall());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findDetails(@PathVariable("id") int id){
        return ResponseEntity.ok().body(service.findById(id));
    }
}
