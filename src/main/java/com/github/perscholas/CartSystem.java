package com.github.perscholas;


import java.util.HashMap;
import java.util.Iterator;

public class CartSystem extends TheSystem {
	private HashMap<String, Item> cartItemCollection;

	CartSystem() {
		cartItemCollection = new HashMap<String, Item>();
	}

	@Override
	public void display() {
		Iterator iterator = this.cartItemCollection.entrySet().iterator();
		while (iterator.hasNext()) {
			HashMap.Entry pair = (HashMap.Entry)iterator.next();
			System.out.println("Key = " + pair.getKey());
			Item itemValue =  (Item)pair.getValue();
			System.out.printf("Description: %s, Item Price: %f, Quantity: %d ", itemValue.getItemDesc(),itemValue.getItemPrice(), itemValue.getAvailableQuantity());
		}
		System.out.println("");
	}

	public Boolean add(Item item) {
		if(item == null) {
			return false;
		}
		this.cartItemCollection.put(item.getItemName(), item);
		return true;
	}

	@Override
	public Item remove(String itemName) {
		return cartItemCollection.remove(itemName);
	}
}
