package com.hdfc.vars;

public class Test {

	public static void main(String[] args) {


		Employee e1 = new Employee(101, "Tom", 40000);
		
	System.out.println(e1.getEid() +" "+e1.getEname() +" "+e1.getSalary());
		
		Employee e2 = new Employee(102,"Harish",60000);
		
		System.out.println(e2.getEid() +" "+e2.getEname() +" "+e2.getSalary());
	
		//Employee e3 = new Employee(0,"Sahil",0.0);
		
		Employee  e3 = new Employee();
		
		e3.setEname("Sahil");
		
		System.out.println(e3.getEid()+" "+e3.getEname()+ " "+e3.getSalary());
		

	}

}
