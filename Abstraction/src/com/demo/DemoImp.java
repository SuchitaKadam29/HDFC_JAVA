package com.demo;

public class DemoImp implements MyInterface {

	@Override
	public int add(int a, int b) {
		
		
		return a+b;
		
	}
	
	
	public static void main(String[] args) {
		
		
		MyInterface mi  =	new DemoImp();
		
		int res =	mi.add(4, 5);
		
		System.out.println(res);
		
		
	}
	
	
	

}
