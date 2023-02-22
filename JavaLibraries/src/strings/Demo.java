package strings;

public class Demo extends Object{

	public static void main(String[] args) {


		
		Demo d1 = new Demo(); 
		
		Demo d2 = new Demo();
		
				System.out.println(d1.toString());
				System.out.println(d2.toString());
		
				
				System.out.println(d1.equals(d2));
				System.out.println(d1 == d2);
				
	System.out.println("Strings Demo");
	
		String str1 = "java";
				
		String str2 = "javeed";	
		
		System.out.println("SCP: "+  str1.equals(str2));
		System.out.println("compare scp hashcode");
		System.out.println(str1 == str2);
		
		String str3 = new String("hello");
		
		String str4 = new String("hello");
		
		System.out.println(str3.equals(str4)); // string class equals() compare data
		
		System.out.println(str3 == str4); // compares hashcode or refs
				
				
				System.out.println("compare() method");
				
				String s1 = new String("A"); // 65
				String s2 = new String("B");  // 66
				
				System.out.println(s1.compareTo(s2)); // -ve already sorted order
													// +ve need to sort elements
													// zero both are same
					
				String s11 = new String("King"); 
				String s22 = new String("Ken");  
				
				System.out.println(s11.compareTo(s22));
				
				
				System.out.println("hello"+" world");
				
				System.out.println(s11.concat(s22));
				
				
		
	}
	
	@Override
	public String toString() {
		
		return "demo object ";
	}
	

}
