package arrayclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArraysClassDemo {

	public static void main(String[] args) {

		List<Integer>   list2 =	new LinkedList<Integer>();
		
		list2.add(55);
		list2.add(33);
		list2.add(22);
		list2.add(11);
		list2.add(45);
		list2.add(37);
		
		
		Collections.sort(list2);
		
		System.out.println("sorting using Collections class");
		System.out.println(list2);
		
		int index = Collections.binarySearch(list2, 45);
		
		System.out.println("Element found at position "+(index+1));
		

		Object  arr[] =	list2.toArray();
		
		for (Object item : arr) {
			
			System.out.println(item);
			
		}
		
		String  names[] = {"tom","smith","adam","brown","raju"};
		
		int arr1[] = {4,5,2,1,3,7};
		
		Arrays.sort(arr1);
		
			
		
		
		
		System.out.println("sorted :");
		System.out.println(arr1);
		
		for (int i : arr1) {
			System.out.println(i);
		}
		
		
			List listNames = Arrays.asList(names);
			
				
		
			
			
			/*
			 * System.out.println(listNames);
			 * 
			 * Set set = new TreeSet<String>();
			 * 
			 * set.addAll(listNames);
			 * 
			 * System.out.println(set);
			 */
			
			
			String str = new String("java");
			
			System.out.println("A".equalsIgnoreCase("a"));
			
			StringBuffer sb = new StringBuffer(str);
			
			
			System.out.println(sb.replace(0,2,"kt") );
			
			System.out.println(sb);
			
			
			System.out.println(sb.reverse());
			
			
		
		
	}

}
