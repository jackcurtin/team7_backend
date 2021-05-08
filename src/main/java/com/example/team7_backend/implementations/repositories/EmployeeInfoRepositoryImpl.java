package com.example.team7_backend.implementations.repositories;

import com.example.team7_backend.interfaces.repositories.EmployeeInfoRepository;
import com.example.team7_backend.models.EmployeeInfo;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.*;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeInfoRepositoryImpl implements EmployeeInfoRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public void bulkSave(List<EmployeeInfo> lstEmp) {
        for(EmployeeInfo emp: lstEmp) {
            entityManager.merge(emp);
        }

    }
}
