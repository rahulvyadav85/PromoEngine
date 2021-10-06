package com.promo.dao;

/**
 * 
 * This DAO class is used to perform DB operation on ActivePromos
 *
 */
public class ActivePromosDAO {
	
	/**
	 * This method is used to retrieve ActivePromo for specific Product
	 * 
	 * @param inventoryName
	 * @return ActivePromos
	 */
	public ActivePromos getActivePromo(String inventoryName) {
		return ActivePromos.valueOf(inventoryName);
	}
}
