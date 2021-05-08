package com.example.team7_backend.interfaces.repositories;

import com.example.team7_backend.models.EmployeeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


public interface EmployeeInfoRepository {
    void bulkSave(List<EmployeeInfo> lstEmp);
}
