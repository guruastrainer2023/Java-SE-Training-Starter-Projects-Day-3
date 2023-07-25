package com.training.ui;

import com.training.bean1.Employee;
import com.training.bean2.Manager;

public class Main {

	public static void main(String[] args) {
		Employee employee=new Employee();
		System.out.println(employee.computeAllowance());
		
		Manager manager=new Manager();
		System.out.println(manager.computeAllowance());

	}

}
