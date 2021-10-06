package com.promo.util;

import com.promo.dao.ActivePromos;

/**
 * 
 * This is utility class that has some util methods used across the project
 *
 */
public class PromoEngineUtil {

	/**
	 * This method validates the input provided, if its invalid then return true 
	 * else false
	 * 
	 * @param items
	 * @return isInvaalidInput
	 */
	public static boolean isInValidInput(String items) {
		return items == null || items.trim().length() == 0
				|| items.matches("^[a-zA-Z]*$") || items.matches("\\d+")
				|| !items.matches("(\\d{1,2}[A-Z]{1})+");
	}

	/**
	 * This method is used to verify if ny product has ActivePromo against it
	 * 
	 * @param name
	 * @return hasPromo
	 */
	public static boolean hasPromo(String name) {
		for (ActivePromos activePromo : ActivePromos.values()) {
			if (activePromo.name() == name) {
				return true;
			}
		}
		return false;
	}

}
