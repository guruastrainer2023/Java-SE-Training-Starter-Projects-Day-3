package com.training.bean;
import com.training.bean.Employee;

public class SimpleEmployee implements Employee{
	
	private int id;
	private String name;
	private double basicSalary;
	
	
	
	public SimpleEmployee() {
		super();
		System.out.println("Simple Employee Object Created");
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
		
		return this.basicSalary*0.35;
	}

	@Override
	public double computeDeduction() {
		
		return this.basicSalary*0.1;
	}

	@Override
	public double getNetSalary() {
		
		return this.basicSalary+ this.computeAllowance()-this.computeDeduction();
	}

	@Override
	public String toString() {
		return "SimpleEmployee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + "]";
	}
	
	
	
	

}
