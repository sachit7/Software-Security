package com.asu.edu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.asu.edu.form.Department;
import com.asu.edu.form.Role;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})


public class DepartmentDAO {
	@Autowired private SessionFactory sessionFactory;
	
	@Transactional
	  public List<Department> findAll() {
		try{
			System.out.println("inside department dao");

		    Session session = sessionFactory.getCurrentSession();
		    List departments = session.createQuery("from Department").list();
			System.out.println("dep = "+((Department)departments.get(1)).getDeptName());

		    return departments;
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	  }
}
