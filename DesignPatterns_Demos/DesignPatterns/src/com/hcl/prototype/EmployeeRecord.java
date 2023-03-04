package com.hcl.prototype;

public class EmployeeRecord implements Prototype , Cloneable {

	private int eid;
	private String ename;
	
	
	public static  EmployeeRecord emp = new EmployeeRecord();
	
	@Override
	public  Prototype getClone() {
		// TODO Auto-generated method stub
		
		EmployeeRecord empCopy = null;
		
		try {
			empCopy = (EmployeeRecord)emp.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empCopy;
		
	}

	
	public EmployeeRecord() {
		
		
	}
	

	public EmployeeRecord(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
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

	
}
