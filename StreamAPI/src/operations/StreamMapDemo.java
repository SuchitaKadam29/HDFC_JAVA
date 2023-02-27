package operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapDemo {

	public static void main(String[] args) {

		
		List<String>  list = new ArrayList<String>();
		
		list.add("Tom");
		list.add("Carry");
		list.add("Adam");
		list.add("Brown White");
		list.add("Javeed Khan");
		
		
		Stream<String>  stream =		list.stream();
		
	stream.map((name)->{ System.out.print(name+" : "); return name.length();})
	           .forEach((x)->{System.out.println(x);});
	
	//.forEach(System.out::println);
		
		

	}

}
