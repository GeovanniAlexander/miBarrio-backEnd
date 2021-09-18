package com.example.mibarrio.dao.service;

import com.example.mibarrio.dao.IDepartmentRepository;
import com.example.mibarrio.entity.Department;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentRepositoryImpl implements IDepartmentRepositoryService {

    private final IDepartmentRepository departmentRepository;

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }
}
