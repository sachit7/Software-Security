package com.asu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asu.edu.dao.RoleDAO;
import com.asu.edu.form.Role;

@Service
public class RoleService {

	@Autowired
    private RoleDAO roleDAO;
     
 
    @Transactional
    public List<Role> findAllRoles() {
        return roleDAO.findAll();
    }
 

}
