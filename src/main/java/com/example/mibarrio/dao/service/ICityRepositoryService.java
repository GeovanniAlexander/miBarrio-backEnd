package com.example.mibarrio.dao.service;

import com.example.mibarrio.entity.City;

import java.util.List;

public interface ICityRepositoryService {

    List<City> findAll();

    List<City> findByDepartmentCode(String code);
}
