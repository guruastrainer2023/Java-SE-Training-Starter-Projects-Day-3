package com.training.bean;
import com.training.bean.Employee;

public class Accountant implements Employee{
	private int id;
	private String name;
	private double basicSalary;
	
	
	public Accountant() {
		super();
		System.out.println("Accountant Employee Object Created");
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
		
		return this.basicSalary*0.25;
	}

	@Override
	public double computeDeduction() {
		
		return this.basicSalary*0.07;
	}

	@Override
	public double getNetSalary() {
		
		return this.basicSalary+ this.computeAllowance()-this.computeDeduction();
	}
	@Override
	public String toString() {
		return "Accountant [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + "]";
	}
	
	
}
