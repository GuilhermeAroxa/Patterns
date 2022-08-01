package com.example.flyweight;

import java.util.HashMap;

public class Catalog {

	private HashMap<String, Item> items = new HashMap<>();
	
	public Item lookup(String itemName) {
		if (!items.containsKey(itemName))
			items.put(itemName, new Item(itemName));
		return items.get(itemName);
	}
	
	public int totalItemsName() {
		return items.size();
	}
}
