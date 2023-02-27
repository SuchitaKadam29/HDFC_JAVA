package operations;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {


		Integer  salaries[] = {};
			Stream<Integer> stream =	Arrays.stream(salaries);
			
	Optional<Integer> optional = stream.reduce( (s1,s2)->{return s1+s2;} );
	
	
		if(optional.isPresent()) {
		System.out.println("Result from get() : "+optional.get());
		}
	
				  
			int result =	optional.orElse(0);
			
			System.out.println("Sum of Salaries "+result);
					
		
		

	}

}
