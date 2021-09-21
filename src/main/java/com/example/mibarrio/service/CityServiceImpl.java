package com.example.mibarrio.service;

import com.example.mibarrio.dao.service.ICityRepositoryService;
import com.example.mibarrio.entity.City;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityServiceImpl implements ICityService{

    private final ICityRepositoryService cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public List<City> findByDepartmentCode(String code) {
        return cityRepository.findByDepartmentCode(code);
    }
}
