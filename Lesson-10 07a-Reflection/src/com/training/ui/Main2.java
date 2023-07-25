package com.training.ui;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class Main2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class loadedClass=Class.forName("com.training.bean.Circle");
		
		Constructor constructor=loadedClass.getConstructor(int.class);
		
		Object c=constructor.newInstance(5);
		
		Method method1=loadedClass.getDeclaredMethod("getDiameter");
		Method method2=loadedClass.getDeclaredMethod("computeArea");
		
		method1.setAccessible(true);
		method2.setAccessible(true);
		
		Object result1=method1.invoke(c);
		Object result2=method2.invoke(c);
		
		System.out.println(result1);
		System.out.println(result2);
		
		
	}

}
