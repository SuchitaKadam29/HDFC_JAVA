package com.loops;

public class ArraysDemo {

	public static void main(String[] args) {


		int ar[]  = new int[4];
		
		ar[0] = 101;
		ar[1] = 102;
		
		
		System.out.println(ar);
		
		
		for (int k : ar) {
			
			System.out.println(k);
			
		}
		
		int  a1[] = new int[0];
		
		System.out.println("a1 size "+a1.length);
		

	}

}
