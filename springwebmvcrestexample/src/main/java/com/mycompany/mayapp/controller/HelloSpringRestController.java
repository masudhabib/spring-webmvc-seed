package com.mycompany.mayapp.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.mayapp.domain.TestClass;

@RestController
@RequestMapping("/hellomvc/")
public class HelloSpringRestController {

	@GetMapping(value="getmapping/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TestClass> ourWebMethod(
			@PathVariable Integer id,
			@RequestParam (required=true) String description) {
		System.out.println("inside our web method");
		
		TestClass testClass = new TestClass();
		testClass.setId(id + 5);
		testClass.setName("Sahara");
		testClass.setDescription(description);
		
		return new ResponseEntity<TestClass>(testClass, HttpStatus.OK);
	}
	
	@PostMapping(value="getmapping", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> ourWebMethod(
			@RequestBody TestClass testClass) {
		System.out.println("inside our web method");
		System.out.println(testClass);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	

}
