package com.promo.dao;

/**
 * 
 * This DAO class is used to perform DB operations on Inventory
 */
public class InventoryDAO {
	
	/**
	 * This method is used to to retrieve all inventories
	 * @return Inventory[]
	 */
	public Inventory[] retrieveInventories() {
		return Inventory.values();
	}

}
