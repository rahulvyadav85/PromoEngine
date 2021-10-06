package com.promo.java;

import java.util.Scanner;

import com.promo.service.PromoEngineExecutor;
import com.promo.util.PromoEngineUtil;

/**
 * 
 * This is the class having main method
 *
 */
public class PromoEngine {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in); 
		String items = myScan.nextLine();
		//System.out.println("Input.."+items);
		while (PromoEngineUtil.isInValidInput(items)) {
			System.out.println("Please enter valid input...");
			items = myScan.nextLine();
		}
		PromoEngineExecutor promoEngineExecutor = new PromoEngineExecutor();
		promoEngineExecutor.executePromoEngine(items);
	}
}





