package com.training.util;

import com.training.bean.Accountant;
import com.training.bean.Employee;
import com.training.bean.Manager;
import com.training.bean.SimpleEmployee;

public class Factory {

	public static Employee getEmployee(int i) {
		if(i==1)
			return new SimpleEmployee();
		else if(i==2)
			return new Accountant();
		else
			return new Manager();
	}
}
