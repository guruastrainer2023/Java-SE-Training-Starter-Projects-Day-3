package com.training.bean2;



public class Manager {
	double basicSalary=30000.00;
	
	public double computeAllowance() {
		Calculator c=new Calculator();
		return c.multiply(basicSalary, 0.55);
	}
}
