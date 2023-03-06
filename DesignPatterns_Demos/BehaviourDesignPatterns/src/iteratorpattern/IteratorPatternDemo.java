package iteratorpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class IteratorPatternDemo {

	public static void main(String[] args) {

		System.out.println(" Set Iterator / Cursor ");

		Set<Integer> set = new HashSet<Integer>();
		
			set.add(33);
			set.add(22);
			set.add(35);
			set.add(26);
			set.add(31);
			set.add(29);
		
				Iterator<Integer> it =		set.iterator();
				
					while(it.hasNext()) {
						
						
						System.out.println(it.next());
						
					}
					
					
		List<Integer> list = new ArrayList<Integer>();	
		
		list  =	Arrays.asList(10,20,30,60,40,50);
				
		System.out.println(" List Iterator / Cursor ");
		
		Iterator<Integer> it2 =		list.iterator();
			
				while (it2.hasNext()) {
					Integer i = it2.next();
					
					System.out.println(i);
					
				}
				
				
				System.out.println("ListIterator forward Cursor");
				
			ListIterator<Integer> listIt =			list.listIterator();
				
			
				while (listIt.hasNext()) {
					System.out.println(listIt.next());
					
				}
				
				
				System.out.println("ListIterator backward Cursor");
				while(listIt.hasPrevious()) {
					
					System.out.println(listIt.previous());
					
				}
				
		
				
				System.out.println("Enumeration cursor for legacy classes");
				
					Vector  vec = new Vector<Integer>();		
				
					vec.add(33);
					vec.add(22);
					vec.add(35);
					vec.add(26);
				
				Enumeration<Integer> en =		vec.elements();
						
					
				while (en.hasMoreElements()) {
					System.out.println(en.nextElement());
					
				}
					

	}

}
