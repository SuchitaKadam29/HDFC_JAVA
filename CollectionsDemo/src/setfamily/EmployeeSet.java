package setfamily;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeSet {

	public static void main(String[] args) {


		Set<Employee> set = new	HashSet<Employee>();
		//here eid is the hashcode
			set.add(new Employee(103, "naresh", 5000));
			set.add(new Employee(105, "adarsh", 7000));
			set.add(new Employee(101, "rushikesh",3000));
			set.add(new Employee(102, "javeed", 8000));
			
			System.out.println(set);
		
		
			Set<Employee> set2 = new	LinkedHashSet<Employee>();
			
				set2.add(new Employee(103, "naresh", 5000));
				set2.add(new Employee(105, "adarsh", 7000));
				set2.add(new Employee(101, "rushikesh",3000));
				set2.add(new Employee(102, "javeed", 8000));
				
				System.out.println(set2);
			
			System.out.println("TreeSet with Employees objects");
				
				Set<Employee> set3 = new	TreeSet<Employee>(new EmpComparator());
				
				set3.add(new Employee(103, "naresh", 5000));
				set3.add(new Employee(105, "adarsh", 7000));
				set3.add(new Employee(101, "rushikesh",3000));
				set3.add(new Employee(102, "javeed", 8000));
				set3.add(new Employee(102, "javeed", 8000));
				
				
				System.out.println(set3.size());
				
				
				
			
	}

}
