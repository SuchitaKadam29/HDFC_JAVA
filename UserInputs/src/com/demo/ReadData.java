package com.demo;

import java.lang.*;

import java.util.*;

public class ReadData  {

	public static void main(String[] args) {
		
		
		Scanner  scanner = new Scanner(System.in);
		
		
		System.out.println("Enter User Id");  // "101"
		
		int id =	scanner.nextInt();
		
		
		scanner.nextLine();// enter key will be handle
		
		System.out.println("Enter your User name"); // "javeed"
		
			String name =	scanner.nextLine();
		// student.setStudentName(name);
		
		System.out.println("Enter your amount");// "5000.99"
		
		
			double amount =	scanner.nextDouble();
		
		
		System.out.println(id + " " + name +" "+ amount );
		

	}

}
