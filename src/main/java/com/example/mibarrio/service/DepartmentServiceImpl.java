package com.example.mibarrio.service;

import com.example.mibarrio.api.DepartmentResponse;
import com.example.mibarrio.dao.IDepartmentRepository;
import com.example.mibarrio.entity.Department;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements IDepartmentService{

    private final IDepartmentRepository departmentRepository;

    @Override
    public List<DepartmentResponse> findAll() {
        return departmentRepository.findAll().stream()
                                             .map(i -> {
                                                 return new DepartmentResponse(i.getId(), i.getName());
                                             }).collect(Collectors.toList());
    }
}
