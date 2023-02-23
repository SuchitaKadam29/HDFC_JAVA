package com.hdfc.bankapp;

public class Util {
	
	
	public static IBank getObject(){
		
		
		return new BankImp2();
		
	}

}
