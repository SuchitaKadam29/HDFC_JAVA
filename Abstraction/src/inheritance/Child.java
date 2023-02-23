package inheritance;

public class Child extends Parent {
	
		int cid =99;
		
		public Child() {
			
			super(); // Parent();
			
			System.out.println("Child Object Created");
		}
		
		public void m2() {
			
			System.out.println("m2() is called from child");
			
		}
	
		@Override
		public Child m1() { // overriding method is runtime polymorphism
		
			
			System.out.println("m1() from Child class");
			
			return null;
		}
	
	
		public Child m1(int a) {
			
			
			return null;
		}
		

}
