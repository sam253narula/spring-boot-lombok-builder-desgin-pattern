package com.spring.boot.design.pattern.builder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.design.pattern.builder.dto.Employee;
import com.spring.boot.design.pattern.builder.dto.Organization;
import com.spring.boot.design.pattern.builder.dto.Project;

	
@Service
public class ServiceExample {
	
	private List<Organization> organizations = new ArrayList<Organization>();
	
	public List<Organization> createOrganization(Organization organization) {
		organizations.add(organization);
		return organizations;
	}
	
	public List<Organization> getAllOrganizations() {
		Employee samarth = Employee.builder().name("Samarth").age(24).salary(30000).build();
		List<Employee> employees = new ArrayList<>();
		employees.add(samarth);
		Project paymentGateway  = Project.builder().name("paymentGateway").capacity(50).budget(999999).build();
		List<Project> projects = new ArrayList<>();
		projects.add(paymentGateway);
		Organization mockOrgnizatiion = Organization.builder().name("mockOrgnizatiion").employee(employees).projects(projects).marketValue(99999).build();
		organizations.add(mockOrgnizatiion);
		
		return organizations;
		
	}
	
}


