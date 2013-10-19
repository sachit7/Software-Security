package com.asu.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.asu.edu.form.Role;
import com.asu.edu.service.RoleService;


@Controller
//@RequestMapping("/")
public class RoleController {
	@Autowired private RoleService roleService;

	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String list(Model model) {
		List<Role> roles = roleService.findAllRoles();
		model.addAttribute("roles", roles);
		return "roles";
	}
}
