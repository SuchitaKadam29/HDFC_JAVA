package com.spring.hateoas.controller;

import java.awt.PageAttributes.MediaType;
import java.util.Arrays;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.server.core.ControllerEntityLinks;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hateoas.entity.User;

@RestController
@RequestMapping("/rest/users")
public class UserRestController {
	
	@GetMapping("/all")
	public  List<User> getAll(){
		
		User user1 = new User("Smith", 50000);
		User user2 = new User("Ford", 30000);
		
	return 	Arrays.asList(user1,user2);
		
		
	}
	
	
	@GetMapping(value="/hateoas/all",produces = MediaTypes.HAL_JSON_VALUE)
	public  List<User> getHateOASAll(){
		
		User user1 = new User("Smith", 50000);

			Link link = WebMvcLinkBuilder.linkTo(UserRestController.class).slash(user1.getUsername()).withSelfRel();
			user1.add(link);
		
		User user2 = new User("Ford", 30000);
		
		Link link2 = WebMvcLinkBuilder.linkTo(UserRestController.class).slash(user2.getUsername()).withSelfRel();
		user2.add(link2);
		
	return 	Arrays.asList(user1,user2);
		
		
	}
	
	@GetMapping("/{username}")
	public  User getUserByName(@PathVariable String username){
		
		User user1 = new User("Smith", 50000);
		User user2 = new User("Ford", 30000);
		
	
		if(user1.getUsername().equals(username)) {
			
			return user1;
		}
		
		
		return user2;
		
		
		
	}
	
	
	

}
