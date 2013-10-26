package com.asu.edu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.asu.edu.CustomHibernateDaoSupport;
import com.asu.edu.form.UserAuthentication;
import org.hibernate.Query;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})

public class LoginDAO extends CustomHibernateDaoSupport{
	
	@Autowired private SessionFactory sessionFactory;
	@Transactional
	public UserAuthentication validate(UserAuthentication userAuth){
		
	    Session session = sessionFactory.getCurrentSession();
	    Query query = session.createQuery("from UserAuthentication ua where ua.UserName=:username and ua.Passwd=:pwd");
	    query.setParameter("username", userAuth.getUserName());
	    query.setParameter("pwd", (new Integer(userAuth.getPasswd().hashCode())).toString());
	    
	    List userList = query.list();
	    
		if(userList.size() != 0)
			try{
				return (UserAuthentication)userList.get(0);
			}
			catch(IndexOutOfBoundsException ioe){
				System.out.println("userList: "+userList);
				ioe.printStackTrace();
			}
		return null;
	}
}
