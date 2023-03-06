package com.hdfc.ems.presentation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.hdfc.ems.entity.Employee;
import com.hdfc.ems.service.EmployeeServiceImp;
import com.hdfc.ems.service.IEmployeeService;

public class Client {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		IEmployeeService service = new EmployeeServiceImp();

		boolean flag = true;

		while (flag) {

			System.out.println("1. Add Employee");
			System.out.println("2. Get All Employees");
			System.out.println("0. Exit/Logout");

			int choice = scanner.nextInt();

			int count = 0;

			switch (choice) {
			case 1:
				// accept inputs from end-users

				System.out.println("Enter Eid");

				int eid = scanner.nextInt();

				System.out.println("Enter EName");

				String ename = scanner.next();

				System.out.println("Enter Salary");

				double salary = scanner.nextDouble();

				Employee emp = new Employee(eid, ename, salary);

				count = service.addEmployee(emp);

				System.out.println(count + "record inserted..");

				break;
			case 2:

				List<Employee> list = service.getAllEmployees();

				Stream<Employee> stream1 =	list.stream();
				
				stream1.forEach((employee)->{System.out.println(employee);});

				break;

			case 3:

				flag = false;
			
				System.out.print("Thank YOU");
				
				break;

			default:
				System.err.print("Invalid input");

				break;

			}

		}

	}
}
