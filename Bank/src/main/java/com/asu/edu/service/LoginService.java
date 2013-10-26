package com.asu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asu.edu.dao.LoginDAO;
import com.asu.edu.dao.RoleDAO;
import com.asu.edu.form.Role;
import com.asu.edu.form.UserAuthentication;


@Service
public class LoginService {
	@Autowired
    private LoginDAO loginDAO;
     
 
    @Transactional
    public boolean validation(UserAuthentication userAuthObj) {
        UserAuthentication authObj =  loginDAO.validate(userAuthObj);
        if(authObj != null)
        	return true;
        
        return false;
        
    }
}
