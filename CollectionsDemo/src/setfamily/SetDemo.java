package setfamily;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {


		Set<String>  set = new HashSet<String>();
		
			set.add("ford");//@c33
			System.out.println(set.add("smith")); //@b22
			set.add("adam"); //@a11
			set.add("david");//@e55
			System.out.println(set.add("smith"));
			
			System.out.println(set);
		
			
		// LinkedList + HashSet
			System.out.println("LinkedHashSet Demo");
			
			Set<String>  set2 = new LinkedHashSet<String>();
			
			set2.add("ford");
			System.out.println(set2.add("smith")); 
			set2.add("adam"); 
			set2.add("david");
			System.out.println(set2.add("smith"));
			
			System.out.println(set2);
			
				// TreeSet sorted in natural order
			System.out.println("TreeSet demo");
			
			Set<String>  set3 = new TreeSet<String>(new MyComparator());
			
			set3.add("ford");
			System.out.println(set3.add("smith")); 
			set3.add("adam"); 
			set3.add("david");
			System.out.println(set3.add("smith"));
			
			System.out.println(set3);
			
			
			// TreeSet<Integer> sorted in natural order
						
						Set<Integer>  set4 = new TreeSet<Integer>();
						
						set4.add(55);
						set4.add(33); 
						set4.add(44); 
						set4.add(11);
						
						
						System.out.println(set4);

	}

}
