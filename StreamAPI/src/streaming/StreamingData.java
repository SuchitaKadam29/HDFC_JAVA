package streaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamingData {

	public static void main(String[] args) {

		Stream stream1 = Stream.of(10, 40, 30, 20, 50);

		Consumer<Integer> consumer = (data) -> {
			System.out.println(data);
		};

		
//Consumer<Integer> consumer2 = System.out::println;

		
		
		stream1.forEach(consumer);

		Integer arr[] = new Integer[] { 22, 4, 66, 88, 99 };

		Stream<Integer> stream2 = Arrays.stream(arr);

		stream2.forEach((x) -> {
			System.out.println(x);
		});
		
	//	stream2.forEach(consumer); // we cant use same stream more than once.
		
		List<String>  list = new ArrayList<String>();
		
				list.add("Tom");
				list.add("Carry");
				list.add("Adam");
				list.add("Brown White");
				list.add("Javeed Khan");
				
			Stream<String>  stream3 =	list.stream();
			
			stream3.forEach((name)->{System.out.println(name);});
		
		
		

	}

}
