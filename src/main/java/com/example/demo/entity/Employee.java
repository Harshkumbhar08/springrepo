package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Employee {

	private int empId;
	private String empName;
}
