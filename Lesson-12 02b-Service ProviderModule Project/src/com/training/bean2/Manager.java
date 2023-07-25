package com.training.bean2;

import com.training.bean1.Employee;

public class Manager implements Employee{
	
	
	private int id;
	private String name;
	private double basicSalary;
	
	public Manager() {
		super();
		System.out.println("Manager Employee Object Created");

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public double computeAllowance() {
		
		return this.basicSalary*0.50;
	}

	@Override
	public double computeDeduction() {
		
		return this.basicSalary*0.08;
	}

	@Override
	public double getNetSalary() {
		
		return this.basicSalary+ this.computeAllowance()-this.computeDeduction();
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + "]";
	}
	@Override
	public int getType() {
		
		return 3;
	}
	
	

}
