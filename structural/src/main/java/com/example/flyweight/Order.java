package com.example.flyweight;

public class Order {

	private final int orderNumber;
	private final Item item;
	
	public Order(int orderNumber, Item item) {
		this.orderNumber = orderNumber;
		this.item = item;
	}
	
	void processOrder() {
		System.out.println("Ordenando Item " + item + " pela ordem " + orderNumber);
	}
}
