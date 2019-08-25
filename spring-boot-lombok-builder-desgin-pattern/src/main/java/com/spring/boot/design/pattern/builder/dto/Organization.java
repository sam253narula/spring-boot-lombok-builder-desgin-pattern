package com.spring.boot.design.pattern.builder.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Organization {
	private String name;
	List<Employee> employee;
	List<Project> projects;
	private int marketValue;
}
