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
	    Session session = sessionFactory.getCurrentSession();
	    List roles = session.createQuery("from Role").list();
	    return roles;
	  }
}
