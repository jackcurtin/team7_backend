package com.example.team7_backend.interfaces.repositories;

import com.example.team7_backend.models.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeInfoJPARepository extends JpaRepository <EmployeeInfo, String> {

}
