package com.promo.service;

import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * This class is used to invoke the Billing service and get the total billed amount
 * It also creates and provide input required to calculate toalBillAmount   
 *
 */
public class PromoEngineExecutor {
	
	/**
	 * This method invokes BillingService to calculate the final bill
	 * 
	 * @param items
	 * @return totalBilledAmount
	 */
	public int  executePromoEngine(String items) {
		if (items == null || items.trim().length() == 0) {
			System.out.println("Invalid input");
			return 0;
		}
		BillingService billingService = new BillingService();
		Map<String, Integer> prodMap = createProductMap(items);
		//System.out.println(prodMap);
		Integer totalBilledAmount = billingService.calculateTotalAmount(prodMap);
		System.out.println("Total Amount::" + totalBilledAmount);
		return totalBilledAmount;
	}
	
	/**
	 * This method generates the ProductMap which is used as input to BillingService
	 * to calculate the bill amount
	 * 
	 * @param items
	 * @return prodMap
	 */
	private static Map<String, Integer> createProductMap(String items) {
		items = items.toUpperCase();
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
		return prodMap;
	}
}
