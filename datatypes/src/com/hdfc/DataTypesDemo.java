package com.hdfc;

public class DataTypesDemo {

	public static void main(String[] args) {


		byte b = 50;
		System.out.println("Byte Range "+Byte.MIN_VALUE  +"to"+ Byte.MAX_VALUE);
		
		int i = 99;
		
		long l = 999955555890438908L;
		
		int x =  b; // here implicit type casting done by compiler  int x = (int) 
		
		System.out.println(x);
		
		long l2 =  i;
		
		System.out.println(l2);
		
		
		int y = (int) l;
		
		System.out.println(y);
		
		
	  byte bt = (byte) 130;
	  
	  	System.out.println(bt);
		
		
	  		
	  	float f1 = (float) 4.555;
	  	
	  	float f2 = 4.1234567890123456f; // max 6 digits after decimal point
	  	
	  	float f3 = l;
	  			System.out.println(f2);
	  	
	  			System.out.println(f3);
	  	
	  	double d =  5.1234567890123456; // max 15 digits after decimal point
	  	
	  	double d2 = l;
	  	
	  	double d3 = 0.000000000001;
	  	
	  	System.out.println(d);
	  	
	  	System.out.println(d2);
	  	
	  	System.out.println(d3);
		
		
		int z = (int)4.555;
		
			System.out.println(z);
		
		
		

	}

}
