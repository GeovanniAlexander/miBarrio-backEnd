package com.example.mibarrio.controller;

import com.example.mibarrio.entity.City;
import com.example.mibarrio.service.ICityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/city")
@AllArgsConstructor
public class CityController {

    private final ICityService cityService;

    @GetMapping
    public List<City> getCities(){
        return cityService.findAll();
    }

    @GetMapping(value = "/department")
    public List<City> getCitiesByDepartment(@RequestParam("code") String code){
        return cityService.findByDepartmentCode(code);
    }
}
