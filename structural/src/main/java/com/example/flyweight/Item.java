package com.example.flyweight;

public class Item {

	private final String name;
	
	public Item (String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
}
