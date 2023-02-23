package inheritance;

public class Main {

	public static void main(String[] args) {

		
		Parent p = new Parent();
		
		/*
		 * 
		 * 
		 * 
		 * System.out.println(p.pid); p.m1();
		 * 
		 * System.out.println(p.toString());
		 */
			
			
			System.out.println("child class");
			
			Child c  = new Child();
			
			System.out.println(c.cid);
			
			//c.m2();
			
			c.m1(); 
			
			System.out.println(c.toString());
			
			//Super class ref holding child class objects Runtime POlymorphism.
			
			Object o = new Parent(); // new Child();
		
			Parent p1 = new Child();
			
			
			p1.m1();
			
			
			
			
			
		
		
	}

}
