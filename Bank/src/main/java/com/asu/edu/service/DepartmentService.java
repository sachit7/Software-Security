package com.asu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asu.edu.dao.DepartmentDAO;
import com.asu.edu.form.Department;

@Service
public class DepartmentService {
	@Autowired
    private DepartmentDAO deptDAO;
     
 
    @Transactional
    public List<Department> findAllDepts() {
        return deptDAO.findAll();
    }
 
}
