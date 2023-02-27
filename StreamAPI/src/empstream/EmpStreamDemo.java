package empstream;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class EmpStreamDemo {

	public static void main(String[] args) {


		Set<Employee> set = new	HashSet<Employee>();
		
			set.add(new Employee(103, "naresh", 5000.0));
			set.add(new Employee(105, "adarsh", 7000.0));
			set.add(new Employee(101, "rushikesh",3000.0));
			set.add(new Employee(102, "javeed", 8000.0));
			
			//System.out.println(set);
			
		Stream<Employee> stream =		set.stream();
		
		
			// display all
		
		//stream.forEach(System.out::println);
		
		//stream.forEach((emp)->{System.out.println(emp);});
		
		// display  employees name 
		
		/*
		 * stream.map((emp)->{return emp.getEname();}) .forEach(System.out::println);
		 */
			// process data and collect dont display
			
		List<String> names =	stream.map((emp)->{return emp.getEname();})
			.collect(Collectors.toList());
		
			System.out.println(names);
			
			
			
			
			Stream<Employee> stream2 =		set.stream();
	
	List<Double> salaries =	stream2.map((e1)->{return e1.getSalary();})
					.collect(Collectors.toList());
	
	Optional<Double>  opt = 			salaries.stream().reduce((s1,s2)->{return s1+s2;});
					
	
	Double sum =	opt.orElse(0.0);
			
			System.out.println(sum);
		
	
	}

}
