package com.promo.dao;

/**
 * 
 * This class is used to mock Inventory Database
 *
 */
public enum Inventory {
	A(50),
	B(30),
	C(20),
	D(15);
	
	private int price;
	
	Inventory(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
}