package com.lombok.demo;

import java.time.LocalDate;

public class Employee {
	
	
	private int eid;
	private String ename;
	
	private LocalDate doj;
	
	
	
	
	public Employee(int eid, String ename,  LocalDate doj) {
		super();
		this.eid = eid;
		this.ename = ename;
	
		this.doj = doj;
	}


	public LocalDate getDoj() {
		return doj;
	}


	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}


	

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename  + ", doj=" + doj + "]";
	}


	
	

}
