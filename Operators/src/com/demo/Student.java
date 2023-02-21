package com.demo;

public class Student  extends Object {

	public static void main(String[] args) {

		
			Student s1 = new Student();
			
				System.out.println(s1);
		
		 // Object  o1  = new Student();		
				
				
			Object o =	get();
			
			 System.out.println(s1 instanceof Student);

			 
			 int result =  5+3 - 2*2 + 1;
			 
			 System.out.println(result);
			 
		
	}
	
	
	public static Object  get() {
		
		
		return new Student();
		
	}
	
	

}
