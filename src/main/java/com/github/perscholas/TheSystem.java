package com.github.perscholas;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class TheSystem {
	private HashMap<String, Item> itemCollection;

	TheSystem() {
        itemCollection = new HashMap<String, Item>();
	}

	public Boolean checkAvailability(Item item) {
		int availability = itemCollection.get(item.getItemName()).getAvailableQuantity();
		if (availability == 0) {
			return false;
		}
		return true;
	}
	
	public Boolean add(Item item) {
		if(item == null ) {
			return false;
		}
		itemCollection.put(item.getItemName(), item);
		return true;
	}

	public Item remove(String itemName) {
		return this.itemCollection.remove(itemName);
	}

	public HashMap<String, Item> getItemCollection() {
		return itemCollection;
	}

	public abstract void display();
}
