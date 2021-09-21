package com.example.mibarrio.service;

import com.example.mibarrio.api.DepartmentResponse;
import com.example.mibarrio.entity.City;

import java.util.List;

public interface IDepartmentService {

    List<DepartmentResponse> findAll();
}
