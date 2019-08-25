package com.spring.boot.design.pattern.builder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.design.pattern.builder.dto.Organization;
import com.spring.boot.design.pattern.builder.service.ServiceExample;

@RestController
@RequestMapping("/home")
public class ExampleController {
	
	@Autowired
	ServiceExample serviceExample;
	
	@PostMapping("/createOrganization")
	public List<Organization> createOrganization(@RequestBody Organization organization) {
		return serviceExample.createOrganization(organization);
	}
	
	@GetMapping("/getOrganizations")
	public List<Organization> getOrganizations(){
		return serviceExample.getAllOrganizations();
	}

}
