package com.spring.boot.design.pattern.builder.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Project {
	private String name;
	private int capacity;
	private int budget;
}
