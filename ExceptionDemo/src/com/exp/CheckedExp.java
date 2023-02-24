package com.exp;

public class CheckedExp {

	public static void main(String[] args)  {


			System.out.println("hello");
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			System.out.println("friends");
		
	}

}
