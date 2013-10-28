package com.asu.edu.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asu.edu.dao.LoginDAO;
import com.asu.edu.dao.RegisterDAO;
import com.asu.edu.form.Department;
import com.asu.edu.form.Role;
import com.asu.edu.form.UserAuthentication;
import com.asu.edu.form.UserDtls;
import com.asu.edu.util.MasterCache;

@Service
public class RegistrationService {

	@Autowired private RegisterDAO registerDAO;

	
    @Transactional
    public boolean saveDetails(UserDtls userDtls, UserAuthentication userAuth) {
        
        if(registerDAO.save(userDtls, userAuth))
        	return true;
        else
        return false;
        
    }


	
	
}
