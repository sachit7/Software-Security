package com.asu.edu.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.asu.edu.POJO.Register;
import com.asu.edu.form.Department;
import com.asu.edu.form.Role;
import com.asu.edu.service.DepartmentService;
import com.asu.edu.service.RegistrationService;
import com.asu.edu.service.RoleService;
import com.asu.edu.util.MasterCache;

@Controller
public class RegisterController {

	private static ArrayList<Department> deptArray;

	private static ArrayList<Role> rolesArray;

	@Autowired private RegistrationService registerService;
	@Autowired private RoleService roleService;
	@Autowired private DepartmentService deptService;
	

	@RequestMapping(value="/newUser", method = RequestMethod.GET)
    public String register(Model model) {
		System.out.println("In Register");
		initArrays();
		model.addAttribute("register", new Register());
		model.addAttribute("deptList", deptArray);
		model.addAttribute("roleList", rolesArray);
		
		
		//model.put("", new Login());
       // map.put("contactList", contactService.listContact());
 
        return "register";
    }

	

	private void initArrays() {
		System.out.println("inside init");
		try {
			if (rolesArray == null) {
				System.out.println("in role array");
				rolesArray = new ArrayList<Role>();
				Map rolesMap = MasterCache.getRoleMap(roleService);
				Iterator it = rolesMap.entrySet().iterator();
				Map.Entry pairs;
				int i=0;
				while (it.hasNext()) {
					pairs = (Map.Entry) it.next();
					Role role = (Role) pairs.getValue();
					rolesArray.add((Role) pairs.getValue());
					System.out.println(rolesArray.get(i));
					i++;
				}
			}
			if (deptArray == null) {
				System.out.println("inside dArray");

				deptArray = new ArrayList<Department>();
				Map deptMap = MasterCache.getDepartmentMap(deptService);
				System.out.println("dept MAP " + deptMap);
				Iterator it = deptMap.entrySet().iterator();
				Map.Entry pairs;
				int i=0;
				while (it.hasNext()) {
					System.out.println("inside iterator");

					pairs = (Map.Entry) it.next();
					deptArray.add((Department) pairs.getValue());
					System.out.println(deptArray.get(i));
					i++;
				}
			}

			
		} catch (Exception e) {
			e.getStackTrace();
		}

	}
	
}
