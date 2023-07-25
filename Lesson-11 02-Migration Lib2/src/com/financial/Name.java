package com.financial;

public class Name {
	private String name;
	private String initial;
	
	public Name(String name, String initial) {
		super();
		this.name = name;
		this.initial = initial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	@Override
	public String toString() {
		return "Name [name=" + name + ", initial=" + initial + "]";
	}
	
	
}
