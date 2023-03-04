package adapter;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {


		Collection collection=		new LinkedList();
		
			collection.add("Tom");
			collection.add("Smith");
			
			System.out.println(collection);
			
			//collection.add("King");
			
			//System.out.println(collection);
			
				//collection.add("king");
				
				List list = (List) collection;
				
				list.add(1, "King");
				
				System.out.println(list);
			
			
			
			
		
	}

}
