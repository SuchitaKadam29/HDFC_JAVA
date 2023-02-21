package com.loops;

public class MultiDArray {

	public static void main(String[] args) {

			int  ar[][] = { {101,2} ,
							{4,5} ,
							{7,9}
							};
		
		
			System.out.println(ar);
			System.out.println(ar[0]);
			
			System.out.println(ar.length);
			
			System.out.println(ar[1].length);
			
			System.out.println(ar[0][0]);
			
			System.out.println(ar[2][0]);
			
			
			int arr[][] = new int[3][];
			
			System.out.println("2D- dynamic array");
			
			System.out.println(arr.length);
			System.out.println(arr[0]);
			
			arr[0] = new int[2];
			arr[0][0] = 99;
			arr[0][1] = 55;
			
			System.out.println(arr[0]);
		
			arr[1] = new int[3];
			
			
			arr[2] = new int[4];
			
			
			arr[2][3] = 1000;
			
			System.out.println(arr[2][3]);
			

	}

}
