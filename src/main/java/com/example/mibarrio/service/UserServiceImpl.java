package com.example.mibarrio.service;

import com.example.mibarrio.dao.service.ICityRepositoryService;
import com.example.mibarrio.entity.City;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements ICityService{

    private final ICityRepositoryService cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
}
