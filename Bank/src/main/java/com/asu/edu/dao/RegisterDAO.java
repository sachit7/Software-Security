package com.asu.edu.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.asu.edu.form.Role;
import com.asu.edu.form.UserAuthentication;
import com.asu.edu.form.UserDtls;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class RegisterDAO {
	
	@Autowired private SessionFactory sessionFactory;
	
	@Transactional
	  public boolean save(UserDtls userDtls, UserAuthentication userAuth) {
		try{
			System.out.println("in register dao");
		    Session session = sessionFactory.getCurrentSession();
		    if(session == null){
		    	System.out.println("Session Null");
		    }
		    
		    session.save(userDtls);
		    return true;
		}
		catch(Exception e){
			System.out.println(e.toString());
			e.printStackTrace();
		}
		//return null;
		return false;
	   
	  }
}