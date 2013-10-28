package com.asu.edu.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "department")
public class Department {
	@Id 
	@Column(name="DeptId")
	@GeneratedValue private long DeptId;
	@Column(name="DeptName")
	private String DeptName;
	
	public long getDeptId() {
		return DeptId;
	}
	public void setDeptId(long deptId) {
		DeptId = deptId;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

}
