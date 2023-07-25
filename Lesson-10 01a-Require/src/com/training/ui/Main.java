package com.training.ui;

import java.util.logging.Logger;

import com.training.bean.Welcome;

public class Main {

	public static void main(String[] args) {
		Welcome.print();
		
		Welcome w=new Welcome();
		System.out.println(w.getMessage());
		
		Logger logger=Logger.getLogger(Main.class.getSimpleName());
		logger.info("This is a Logger Message");

	}

}
