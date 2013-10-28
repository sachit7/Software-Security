package com.asu.edu.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;

import net.tanesha.recaptcha.ReCaptcha;
import net.tanesha.recaptcha.ReCaptchaResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.asu.edu.POJO.Login;
import com.asu.edu.POJO.Register;
import com.asu.edu.form.Role;
import com.asu.edu.form.UserAuthentication;
import com.asu.edu.service.LoginService;
import com.asu.edu.service.RoleService;


@Controller
public class LoginController {

	@Autowired private LoginService loginService;
	@Autowired private ReCaptcha reCaptcha = null;


	@RequestMapping("/index")
	public String showLogin(Model model) {
		model.addAttribute("login", new Login());
		//model.put("", new Login());
		// map.put("contactList", contactService.listContact());

		return "login";
	}

	@RequestMapping("/loginfailed")
	public String showLoginFaliure(Model model) {
		//model.addAttribute("login", new Login());
		//model.put("", new Login());
		// map.put("contactList", contactService.listContact());

		return "faliure";
	}

	//	@RequestMapping("/newUser")
	//    public String register(Model model) {
	//		model.addAttribute("register", new Register());
	//		
	//		//model.put("", new Login());
	//       // map.put("contactList", contactService.listContact());
	// 
	//        return "register";
	//    }


	@RequestMapping(value="loginPage", method = RequestMethod.POST)
	public String validateUser(@ModelAttribute("login")Login login,  
			BindingResult result, @RequestParam("recaptcha_challenge_field") String challangeField,
			@RequestParam("recaptcha_response_field") String responseField,
			ServletRequest servletRequest) {


		if (!result.hasErrors()) {
			String remoteAddress = servletRequest.getRemoteAddr();
			ReCaptchaResponse reCaptchaResponse = this.reCaptcha.checkAnswer(
					remoteAddress, challangeField, responseField);
			if (!reCaptchaResponse.isValid()) {
				FieldError fieldError = new FieldError("login",
						"captcha", "Captcha worong. Please try again.");
				result.addError(fieldError);
				System.out.println("Captcha Failed");

			}
			else{
				System.out.println("Captcha Successful");
				UserAuthentication userAuth = prepareModel(login);  
				if(loginService.validation(userAuth))
					return "success";
				else
					return "faliure";

			}


		}
		return "faliure";
	}

	private UserAuthentication prepareModel(Login login){  
		UserAuthentication userAuth = new UserAuthentication();  

		userAuth.setUserName(login.getUserName());
		userAuth.setPasswd(login.getPasswd());

		return userAuth;  
	}

}
