package com.example.mibarrio.controller;

import com.example.mibarrio.entity.City;
import com.example.mibarrio.service.ICityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CityController {

    private final ICityService cityService;

    @GetMapping(value = "/city")
    public List<City> getCities(){
        return cityService.findAll();
    }

}
