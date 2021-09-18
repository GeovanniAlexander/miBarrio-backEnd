package com.example.mibarrio.service;

import com.example.mibarrio.dao.IDepartmentRepository;
import com.example.mibarrio.entity.Department;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements IDepartmentService{

    private final IDepartmentRepository departmentRepository;

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }
}
