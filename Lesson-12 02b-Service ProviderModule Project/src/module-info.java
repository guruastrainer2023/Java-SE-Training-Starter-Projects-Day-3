module module2 {
	requires module1;
	provides com.training.bean1.Employee 
		with com.training.bean2.Accountant, 
		com.training.bean2.Manager,
		com.training.bean2.SimpleEmployee;
	
}