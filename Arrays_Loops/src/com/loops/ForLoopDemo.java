package com.loops;

public class ForLoopDemo {

	public static void main(String[] args) {


		
			for(int i=0;i< 5 ; i++) {
				
				System.out.println("Value : "+i);
				
				
			}
			
			int  nums[] = {11,22,33,44,55};
			
			System.out.println("Arrays Demo");
			
			System.out.println(nums);
			
			System.out.println("size : "+nums.length);
			
			
			for(int i=0; i < nums.length; i++) {
				
				
				System.out.println(nums[i]);
				
			}
			
			
			System.out.println("For Each Loop Demo");
			
			
			for(int x: nums) {  // read only
				
				System.out.println(x);
				
			}
			
		
		

	}

}
