package operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FiltersDemo {

	public static void main(String[] args) {
		
		
		
		List<String>  list = new ArrayList<String>();
		
		list.add("Tom");
		list.add("Carry");
		list.add("Adam");
		list.add("Brown White");
		list.add("Javeed Khan");
		list.add("Carry");
		
		Stream<String> stream =		list.stream();
		
stream.filter((name)->{return name.length() > 4;})
         .map((name)->{System.out.println(name+" : ");return name.length();})
           .forEach(System.out::println);
		
		

		Stream<String> stream2 =		list.stream();
		
		//System.out.println("display with limit");
		//stream2.limit(3).forEach(System.out::println);
		
		//System.out.println("display with skip");
		//stream2.skip(3).forEach(System.out::println);
		
		System.out.println("display unique / distinct");
		stream2.distinct().forEach(System.out::println);
		
		
		

	}

}
