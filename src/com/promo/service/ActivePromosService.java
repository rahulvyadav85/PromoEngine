package com.promo.service;

import com.promo.dao.ActivePromos;
import com.promo.dao.ActivePromosDAO;

/**
 * 
 * This is service class is used to invoke ActivePromosDAO and to perform business logic over ctivePromos if any
 *
 */
public class ActivePromosService {
	
	/**
	 * This method returns the active promo specific to product type
	 * 
	 * @param inventoryName
	 * @return ActivePromos
	 */
	public ActivePromos getActivePromo(String inventoryName) {
		return new ActivePromosDAO().getActivePromo(inventoryName);
	}

}
