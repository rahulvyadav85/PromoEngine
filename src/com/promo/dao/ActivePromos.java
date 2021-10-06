package com.promo.dao;
/**
 * 
 * This class is used to mock ActivePromos Database
 *
 */
public enum ActivePromos {
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
}
