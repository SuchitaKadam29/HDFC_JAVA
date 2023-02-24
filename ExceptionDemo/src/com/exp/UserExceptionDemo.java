package com.exp;

import java.util.Scanner;

public class UserExceptionDemo  {

	static String users[] = { "javeed", "adarsh", "naresh", "pratap" };

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter User Name to search in DB");

		String name = scanner.next();
		String msg = null;
		
			for (String user : users) {
				
				if(user.equals(name)) {
					
					msg = "Welcome "+user;
					
					break;
					
				}
				
				}
			
			
				if(msg != null) {
				
					System.out.println(msg);
				
				}
				else {
					
					try {
						
						
				throw new UserNotFoundException("User Not Available");
						
					} catch (UserNotFoundException e) {

							System.err.println("Sorry! User Not Found");
							
							System.err.println(e);
					}
					
				}
			
			
			
				
			}
		
		
		

	}


