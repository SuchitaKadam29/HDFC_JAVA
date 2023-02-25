package lambdaexp;

@FunctionalInterface
public interface MyInterface { // Functional Interface with exact one abstract method
	
			public abstract int  add(int a, int b);
	
			
			public static void  m1() {
				
				System.out.println("m1() from interface");
				
			}
			
			public default void m2() {
				
				System.out.println("m2() from interface only by implementors");
				
			}
			
			

}
