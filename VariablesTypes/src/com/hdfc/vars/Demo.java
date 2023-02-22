package com.hdfc.vars;

public class Demo {

	  int id;
	  String data;
	
	  static  int sid;
	  static  String sname;
	
	public static void main(String[] args) { // main-thread
	
			int x = 0; //local var
		
			String name = null ;
			
		System.out.print(x);
		System.out.println(name);
		
		
		Demo d1 = new Demo();
		
		System.out.println(d1.toString());
			d1.id = 101;
			d1.data = "hello";
		
			System.out.println("instance vars");
			
		System.out.println(d1.id +" "+d1.data);
		
		Demo d2 = new Demo();
		
		System.out.println(d2.id +" "+d2.data);
		
		
		System.out.println("static vars");
		System.out.println(Demo.sid);
		System.out.println(Demo.sname);
		
			d1.sid = 99;
			d1.sname = "javeed";
		
		
		
			d2.sid = 55;
			d2.sname = "Sahil";
		
		System.out.println("d2 "+d2.sid +" "+ d2.sname);
		
		System.out.println("d1 "+d1.sid +" "+ d1.sname);
		

	}

}
