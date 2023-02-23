package inheritance;

public  class Parent extends Object{
	
		int pid = 100;
		
		
		public Parent() {
			super();    //Object();
			
			System.out.println("Parent Object Created");
			
			
		}
		
		
		public Object m1() {  // final keyword will stop method overriding from parent to any child
			
			System.out.println("m1() called from Parent class");
			
			return null;
		}
	
	
	

}
