package com.example.mibarrio.dao;

import com.example.mibarrio.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICityRepository extends JpaRepository<City, Long> {

    List<City> findByDepartmentCode(String code);
}
