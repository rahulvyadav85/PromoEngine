package com.promo.java;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Promo {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		String items = myScan.nextLine();
		System.out.println("Input.."+items);
		Map<String, Integer> prodMap = new TreeMap<>();
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < items.length(); i++) {
			char product = items.charAt(i);
			if (Character.isAlphabetic(product)) {
				String quantity = strBuilder.toString();
				if (prodMap.get(String.valueOf(product)) == null) {
					prodMap.put(String.valueOf(product), Integer.valueOf(quantity));
				}
				strBuilder = new StringBuilder();
			} else {
				strBuilder.append(product);
			}
		}
		System.out.println(prodMap);
		Integer totalAmount = 0;
		for (ActivePromos activePromos : ActivePromos.values()) {
			Integer actualQuantity = prodMap.get(activePromos.name());
			if (actualQuantity != null) {
				Integer promoQuantity = actualQuantity/activePromos.getQuantity();
				Integer nonPromoQuantity = actualQuantity%activePromos.getQuantity();
				totalAmount = totalAmount + ((promoQuantity * activePromos.getPromoPrice()) + (nonPromoQuantity * (Inventory.valueOf(activePromos.name()).getPrice())));
				System.out.println("Total Amount for "+ activePromos.name() + "is.."+totalAmount);
			}
		}
		System.out.println("Total Amount::" + totalAmount);
	}
	
}

/*enum Inventory {
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

enum ActivePromos {
	A(3, 130),
	B(2, 45),
	CD(1, 30);
	
	private int quantity;
	private int promoPrice;
	
	private ActivePromos(int quantity, int promoPrice) {
		this.quantity = quantity;
		this.promoPrice = promoPrice;
	}
	
	public int getPromoPrice() {
		return this.promoPrice;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
}*/
