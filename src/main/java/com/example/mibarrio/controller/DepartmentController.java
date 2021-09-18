package com.example.mibarrio.controller;

import com.example.mibarrio.entity.Department;
import com.example.mibarrio.service.IDepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DepartmentController {

    private final IDepartmentService departmentService;

    @GetMapping(value = "/department")
    public List<Department> getDepartments(){
        return departmentService.findAll();
    }
}
