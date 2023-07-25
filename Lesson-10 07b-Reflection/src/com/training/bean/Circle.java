package com.training.bean;

public class Circle {
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	private int getDiameter() {
		return 2*radius;
	}
	
	private double computeArea() {
		return 3.14*radius*radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	

}
