package lambdaexp;

public class Test {

	public static void main(String[] args) {


		System.out.println("Hello World");
		
		//MyInterface  mi =  (int x, int y)->{ return x+y;} ;
		
			MyInterface mi = (x,y)-> x+y;
			
			MyInterface.m1();
			
			mi.m2();
			
		
			System.out.println(mi.add(5, 5));
			
			
			// dev-1 not implementing MyInterface not writing lambda
			
			MyInterface.m1();
			
			
		
		
	}

}
