package com.asu.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.asu.edu.POJO.Login;
import com.asu.edu.form.UserAuthentication;


@Controller
public class RegistrationController {
	
	@RequestMapping("newUser")
    public String listContacts(Model model) {
		model.addAttribute("login", new Login());
		//model.put("", new Login());
       // map.put("contactList", contactService.listContact());
 
        return "login";
    }
	
	@RequestMapping(value="abcd", method = RequestMethod.POST)
	public String validateUser(@ModelAttribute("login")Login login,  
			   BindingResult result) {
		
		  UserAuthentication userAuth = prepareModel(login);  
		  if(loginService.validation(userAuth))
			  return "success";
		  else
			  return "faliure";
	}
	
}
