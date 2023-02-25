package mapfamily;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIteration {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>(); 
		
		map.put(101,"Javeed");
		map.put(104, "Smith");
		map.put(102,"Ford");
		map.put(106,"Adam");
		
		System.out.println(map);
		
		System.out.println("Data : "+ map.get(102) );
		
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		
		Set<Integer> keySetObj =	map.keySet();
		
			for (Integer key : keySetObj) {
				
				System.out.println(key +"  "+map.get(key));
				
			}
		
		

	}

}
