package com.asu.edu.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.asu.edu.dao.DepartmentDAO;
import com.asu.edu.dao.RoleDAO;
import com.asu.edu.form.Department;
import com.asu.edu.form.Role;
import com.asu.edu.service.DepartmentService;
import com.asu.edu.service.RoleService;


public class MasterCache {


	private static LinkedHashMap<Long, Department> department;
	private static LinkedHashMap<Long, Role> role;


	public static Map<Long, Department> getDepartmentMap(DepartmentService deptService) {
		System.out.println("inside getDepartmentMap");

		if (department == null) {
			System.out.println("inside department");
			department = new LinkedHashMap<Long, Department>();
			//DepartmentDAO dao = new DepartmentDAO();
			List<Department> deplist = deptService.findAllDepts();
			Iterator<Department> itr = deplist.iterator();	

			while(itr.hasNext()){
				System.out.println("inside iterator");

				Department temp = itr.next();
				department.put(temp.getDeptId(), temp);
			}
		}
		return department;
	}

	public static Map<Long, Role> getRoleMap(RoleService roleService) {
		try{
			if (role == null) {
				System.out.println("In getRoleMap");
				role = new LinkedHashMap<Long, Role>();
				//RoleDAO dao = new RoleDAO();
				List<Role> rolelist = roleService.findAllRoles();
				Iterator<Role> itr = rolelist.iterator();	

				while(itr.hasNext()){

					Role temp = itr.next();
					System.out.println("XYZ"+temp.getRoleName());
					role.put(temp.getRoleId(), temp);
				}
			}
			return role;	

		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	public static void reloadMasterCache() {
//		getDepartmentMap();
//		getRoleMap();
		//errorCode.put("C300", CommonConstants.C300);
	}



}
