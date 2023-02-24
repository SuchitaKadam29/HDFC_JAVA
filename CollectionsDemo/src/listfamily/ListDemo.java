package listfamily;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
	
		System.out.println("ArrayList");
		
		List<Object>   list =	new ArrayList<Object>();
		
			list.add(50); // new Integer(50)
			list.add("javeed");
			list.add(5.66);
			list.add(true);
			list.add(new ListDemo());
			list.add(null);
			
			System.out.println(list);
			
			
			System.out.println("LinkedList");
			
			
	List<Integer>   list2 =	new LinkedList<Integer>();
			
			list2.add(55);
			list2.add(33);
			list2.add(22);
			list2.add(11);
			list2.add(45);
			list2.add(37);
			list2.add(null);
			
			list2.add(0,69);
			
			list2.remove(3);
			
		System.out.println(list2);	
		
		System.out.println("Vector");
		
		List<Integer>   list3 =	new Vector<Integer>();
		
		list3.add(55);
		list3.add(33);
		list3.add(22);
		list3.add(11);
		list3.add(45);
		list3.add(37);
		list3.add(null);
			
			System.out.println(list3);
			
			System.out.println("-----for each----");
			
			for (Integer element : list3) {
				
				System.out.println(element);
				
			}
			
			
			System.out.println("Iteration ");
			
				Iterator it =	list2.iterator();
			
					while(it.hasNext()) {
						
						System.out.println(it.next());
						
					}
			
		

	}

}
