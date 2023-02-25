package lambdaexp;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class DemoPredefinedFuncInterfaces {
	
	
	
	
		public static void main(String[] args) {
			
				
			Supplier<String>  sup =		()->{return "Hello Javeed";};
			
			System.out.println(sup.get());
			
			
	Function<String, Integer> ffi =	(String str)->{return str.length();};
			
		  		int len =	ffi.apply("javeed");
			
		  		System.out.println(len);
		  		
		  		
	//Consumer<String> consumer =	(String name)->{ System.out.println(name); };
		
		
	Consumer<String> consumer = System.out::println;
  		
	
				consumer.accept("HDFC BANK");
	
	
		}
	

}
