package com.training.ui;

import java.util.ServiceLoader;

import com.training.bean1.Employee;


public class Main {

	public static void main(String[] args) {
		int employeeType=3;
		
		Employee employee=null;
		
		ServiceLoader<Employee> loaders=ServiceLoader.load(Employee.class);
		for(Employee e:loaders) {
			if(e.getType()==employeeType)
			{
				employee=e;
				break;
			}
		}
		
		
		employee.setId(101);
		employee.setName("Rahul");
		employee.setBasicSalary(10000);
		
		System.out.println("Employee ID :" + employee.getId());
		System.out.println("Employee NAMe :" + employee.getName());
		System.out.println("Employee BASIC SALARY :" + employee.getBasicSalary());
		System.out.println("Employee ALLOWANCE :" + employee.computeAllowance());
		System.out.println("Employee DEDUCTION :" + employee.computeDeduction());
		System.out.println("Employee NET SALARY :" + employee.getNetSalary());
		

	}

}
