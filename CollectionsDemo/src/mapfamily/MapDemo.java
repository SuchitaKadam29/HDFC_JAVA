package mapfamily;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import setfamily.EmpComparator;
import setfamily.Employee;

public class MapDemo {

	public static void main(String[] args) {

			// Map<K,V>  k= set family rules , v= list family rules
		Map<Integer,String> map = new HashMap<Integer,String>(); 
		
			map.put(101,"Javeed");
			map.put(104, "Smith");
			map.put(102,"Ford");
			map.put(106,"Adam");
			
			System.out.println(map);
		
		
			
	Map<String,Integer> map2 = new HashMap<String,Integer>(); 
			
				map2.put("a", 101);
				map2.put("B", 103);
				map2.put("b", 105);
				map2.put("A", 102);
				map2.put("a", 103);
			
			System.out.println(map2);
		
		Map<Employee,String> map3 = new TreeMap<Employee,String>(new EmpComparator());	
			
			map3.put(new Employee(103, "naresh", 5000),"Developer");
			map3.put(new Employee(105, "adarsh", 7000),"Tester");
			map3.put(new Employee(101, "rushikesh",3000),"Developer");
			map3.put(new Employee(102, "javeed", 8000),"Trainer");
			
			System.out.println(map3);
			
		
	}

}
