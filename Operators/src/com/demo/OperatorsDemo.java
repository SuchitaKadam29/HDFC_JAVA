package com.demo;

public class OperatorsDemo {

		int y;
	static	int z;
	
	String name;  // null
	
	
	public static void main(String[] args) {


			int i = 0;
			
			if(i == 0) {
				
				i++;
				
				System.out.println(i);
				
			}
			
			
			boolean  flag = true;
			
			if (!flag) {
				
					System.out.println("Welcome");
				
			}
			
			int x = 0;
			
			System.out.println(x);
			
		OperatorsDemo op = new OperatorsDemo();
			
		
		System.out.println("instance y "+op.y);
		
		System.out.println("static z "+z);
		
		
			int salary = 0;
			
			//salary = salary + 100;
			
			salary += 100;
			
			System.out.println(salary);
		
			
			int num1 = 50;
			int num2 = 100;
			int max = 0;
			
		max =	(num1 > num2) ? num1 : num2;
			
			System.out.println(" greater is "+max);
		
			
			
		
		

	}

}
