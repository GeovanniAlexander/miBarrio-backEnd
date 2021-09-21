package com.example.mibarrio.controller;

import com.example.mibarrio.api.DepartmentResponse;
import com.example.mibarrio.service.IDepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/api")
@AllArgsConstructor
public class DepartmentController {

    private final IDepartmentService departmentService;

    @GetMapping(value = "/departments")
    public List<DepartmentResponse> getDepartments(){
        return departmentService.findAll();
    }
}
