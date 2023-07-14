package com.asius.back.controller;

import com.asius.back.entity.User;
import com.asius.back.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UsersControllers {

    @Autowired
    private UserServices userServices;

    @PostMapping("/agregar")
    public ResponseEntity<User> guardarUser(@RequestBody User user) {
        User userGuardado = userServices.agregarUser(user);
        return ResponseEntity.ok(userGuardado);
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listarUser(){
        return ResponseEntity.ok(userServices.obtenerUser());
    }

}
