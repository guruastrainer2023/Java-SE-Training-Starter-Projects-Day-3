package com.training.bean1;

public class Employee {

	double basicSalary=10000.00;
	
	public double computeAllowance() {
		Calculator c=new Calculator();
		return c.multiply(basicSalary, 0.50);
	}
	
}
