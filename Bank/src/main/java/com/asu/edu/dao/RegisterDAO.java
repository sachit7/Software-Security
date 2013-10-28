package com.asu.edu.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.asu.edu.form.UserDtls;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class RegisterDAO {
	
	@Autowired private SessionFactory sessionFactory;
	
//	@Transactional
//	  public List<UserDtls> save() {
//	    Session session = sessionFactory.getCurrentSession();
//	    //List roles = session.createQuery("from Role").list();
//	    //return roles;
//	  }
}