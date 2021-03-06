package com.asu.edu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.asu.edu.form.Role;


@Repository
@SuppressWarnings({"unchecked", "rawtypes"})

public class RoleDAO {
	@Autowired private SessionFactory sessionFactory;
	@Transactional
	  public List<Role> findAll() {
		try{
			System.out.println("in role dao");
		    Session session = sessionFactory.getCurrentSession();
		    if(session == null){
		    	System.out.println("Session Null");
		    }
		    List roles = session.createQuery("from Role").list();
		    System.out.println("XYZ in DAO"+((Role)roles.get(0)).getRoleName());
		    return roles;
			
		}
		catch(Exception e){
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return null;
	   
	  }
}
