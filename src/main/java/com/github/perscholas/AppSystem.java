package com.github.perscholas;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

public class AppSystem extends TheSystem {

	AppSystem() {
	}

	@Override
	public void display() {
		HashMap<String, Item> itemCollection = super.getItemCollection();
		Iterator iterator = itemCollection.entrySet().iterator();
		while(iterator.hasNext()) {
			HashMap.Entry pair = (HashMap.Entry)iterator.next();
			System.out.println("Key = " + pair.getKey());
			Item itemValue =  (Item)pair.getValue();
			System.out.printf("Description: %s, Item Price: %f, Quantity: %d ", itemValue.getItemDesc(),itemValue.getItemPrice(), itemValue.getAvailableQuantity());
		}
		System.out.println("");
	}

	@Override
	public Boolean add(Item item) {
		return super.add(item);
	}

	@Override
	public Item remove(String itemName) {
		return super.remove(itemName);
	}

	public HashMap<String, Item> getItemCollection() {
		return super.getItemCollection();
	}
}
