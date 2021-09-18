package com.example.mibarrio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QRController {

    @GetMapping(value = "/test")
    public String test(){
        return "hola";
    }

}
