package com.promo.service;

import com.promo.dao.Inventory;
import com.promo.dao.InventoryDAO;

/**
 * 
 * This is service class is used to invoke InventoryDAO and to perform business logic over Inventory if any
 *
 */
public class InventoryService {
	
	/**
	 * This method is used to retrieve all invetories
	 * @return Inventory[]
	 */
	public Inventory[] retrieveInventories() {
		return new InventoryDAO().retrieveInventories();
	}

}
