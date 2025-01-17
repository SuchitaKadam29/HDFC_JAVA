package com.hdfc.crud.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.crud.entity.Employee;
import com.hdfc.crud.exception.EmployeeNotFoundException;
import com.hdfc.crud.service.IEmployeeService;

@RestController
@RequestMapping("/api/jdbc")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;

	@PostMapping(value = "/add", consumes = "application/json")
	public String addEmployee(@RequestBody Employee emp) {

		String msg = null;

		int count = service.addEmployee(emp);

		if (count > 0) {

			msg = count + " Record Inserted Successfully";

		} else {

			msg = "Insert fail..";
		}

		return msg;

	}

	@PutMapping(value = "/update", consumes = "application/json")
	public String updateEmployee(@RequestBody Employee emp) {

		String msg = null;

		int count = service.updateEmployee(emp);

		if (count > 0) {

			msg = count + " Record Updated Successfully";

		} else {

			msg = "Update fail..";
		}

		return msg;

	}

	// @RequestMapping(method = RequestMethod.GET , value = "/getall")
	@GetMapping(value = "/getall", produces = "application/json")
	public List<Employee> getAll() { // responsebody

		List<Employee> list = service.getAllEmployees();

		return list;

	}

	/*
	 * @GetMapping(value = "/hateoas/getall", produces = MediaTypes.HAL_JSON_VALUE)
	 * public List<Employee> getAllHateoas() { // responsebody
	 * 
	 * List<Employee> list = service.getAllEmployees();
	 * 
	 * for (Employee employee : list) {
	 * 
	 * 
	 * 
	 * Link link =
	 * WebMvcLinkBuilder.linkTo(EmployeeRestController.class).slash("get/"+employee.
	 * getEid()).withSelfRel();
	 * 
	 * employee.add(link);
	 * 
	 * } return list;
	 * 
	 * }
	 */

	@GetMapping("/get/{eid}")
	public Employee getEmployeeById(@PathVariable int eid) throws EmployeeNotFoundException {

		System.out.println(eid);

		Employee emp = service.getEmployeeById(eid);

		if (emp.getEid() == 0) {

			throw new EmployeeNotFoundException();

		}

		return emp;

	}

	@DeleteMapping("/delete/{eid}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable int eid) {

		int count = service.deleteEmployeeById(eid);

		return new ResponseEntity<String>(count + " Record Deleted", HttpStatus.OK);

	}

}
