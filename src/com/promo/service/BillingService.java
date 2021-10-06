package com.promo.service;

import java.util.Map;

import com.promo.dao.ActivePromos;
import com.promo.dao.Inventory;
import com.promo.util.PromoEngineUtil;

/**
 * 
 * This service class is used to perform Billing related calculations 
 *
 */
public class BillingService {
	
	/**
	 * This method is used to calculate bill amount based on the applicable promos
	 * 
	 * @param prodMap
	 * @return totalBillAmount
	 */
	public Integer calculateTotalAmount(Map<String, Integer> prodMap) {
		InventoryService inventoryService = new InventoryService();
		ActivePromosService activePromosService = new ActivePromosService();
		Integer totalBillAmount = 0;
		for (Inventory inventory : inventoryService.retrieveInventories()) {
			Integer actualQuantity = prodMap.get(inventory.name());
			if (actualQuantity != null) {
				if (PromoEngineUtil.hasPromo(inventory.name())) {
					ActivePromos activePromo = activePromosService.getActivePromo(inventory.name());
					Integer promoQuantity = actualQuantity/activePromo.getQuantity();
					Integer nonPromoQuantity = actualQuantity%activePromo.getQuantity();
					totalBillAmount = totalBillAmount + ((promoQuantity * activePromo.getPromoPrice()) + (nonPromoQuantity * (Inventory.valueOf(activePromo.name()).getPrice())));
					//System.out.println("Total Amount for "+ activePromo.name() + "is.."+totalBillAmount);	
				} else {
					totalBillAmount = totalBillAmount + inventory.getPrice() * actualQuantity;
				}
			}
		}
		return totalBillAmount;
	}

}
