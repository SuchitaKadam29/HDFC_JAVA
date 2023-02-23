package com.exp;

public class ExpDemo2 {

	public static void main(String[] args) { // caller

			try {
			int res =	div(10,10);
		
			System.out.println("Result : "+res);
			
			
			}
			catch(ArithmeticException e) {
				
				//e.printStackTrace();
				
				//System.err.print(e);
				
				System.err.println("Sorry! You can't div number by zero");
				
				
			}
			
			finally {
				
				System.out.println("shut down server");
				
			}
			
			String name = "javeed";
			
			System.out.println(name+" name length "+name.length());
			
			
		
	}
	
	public static int  div(int a , int b)throws ArithmeticException{ // callee
		
		
		return a / b;
		
	}
	
	

}
