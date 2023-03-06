package mementopattern;

public class Client {

	public static void main(String[] args) {


		Employee emp = new Employee(101, "Javeed");
		
				emp.setJob("Developer");
				
				System.out.println("Original");
				System.out.println(emp);
		
		
		EmployeeMemento memento =		emp.createMemento(); // store previous state obj
				
				
			emp.setJob("Manager");
			
			System.out.println("Updated");
				System.out.println(emp);
				
				
					emp.restore(memento);
				
					System.out.println("Restore Original");
					System.out.println(emp);
	}

}
