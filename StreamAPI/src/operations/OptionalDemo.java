package operations;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo {

	public static void main(String[] args) {

		
		Optional<Integer> optional =		Optional.of(30);
		
			if(optional.isPresent()) {
				
				System.out.println(optional.get());
				
			}
	
			else {
				
				
				System.out.println("value not found");
			}
			
			
			
		Integer n =	optional.orElse(0); // it return zero only if actual value is missing
		
			System.out.println(n);
			
	}	
	

}
