package com.example.mibarrio.dao.service;

import com.example.mibarrio.dao.ICityRepository;
import com.example.mibarrio.entity.City;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityRepositoryImpl implements ICityRepositoryService{

    private final ICityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public List<City> findByDepartmentCode(String code) {
        return cityRepository.findByDepartmentCode(code);
    }


}
