package com.training.bean1;

public interface Employee {
	double computeAllowance();
	double computeDeduction();
	double getNetSalary();
	public int getId();
	public void setId(int id) ;
	public String getName() ;
	public void setName(String name);
	public double getBasicSalary();
	public void setBasicSalary(double basicSalary) ;
	public int getType();

}
