package com.training.ui;

import com.training.bean.Employee;
import com.training.util.Factory;

public class Main {

	public static void main(String[] args) {
		int employeeType=3;
		
		Employee employee;
		employee=Factory.getEmployee(employeeType);
		
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
