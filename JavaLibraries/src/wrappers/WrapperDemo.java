package wrappers;

import java.lang.*;
import java.lang.String;
import java.lang.System;
import java.lang.Integer;

import static java.lang.System.out;

public class WrapperDemo {

	public static void main(java.lang.String[] args) { // inline import

			
		System.out.println(Integer.SIZE/8 +" bytes");
		
		System.out.println(Short.MIN_VALUE +" to "+Short.MAX_VALUE);
		
			String  data = "500";
			
		int  amount =	Integer.parseInt(data);
		
			out.println(amount + 100 ); // static import
			
			Integer x =  new Integer(400);
			
			
			
			System.out.println(x.toString() + 100); // "400" + 100
		
		
	}

}

