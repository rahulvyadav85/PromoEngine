package test;

import org.junit.Assert;
import org.junit.Test;

import com.promo.service.PromoEngineExecutor;
import com.promo.util.PromoEngineUtil;

/**
 * 
 * This Junit class to unit tests the methods used in Project.
 *
 */
public class PromoEngineJunit {

	@Test
	public void test1() {
		PromoEngineExecutor promoEngineExecutor = new PromoEngineExecutor();
		 int totalAmount = promoEngineExecutor.executePromoEngine("1A1B1C");
		 Assert.assertEquals(100, totalAmount);
	}
	
	@Test
	public void test2() {
		PromoEngineExecutor promoEngineExecutor = new PromoEngineExecutor();
		 int totalAmount = promoEngineExecutor.executePromoEngine("5A5B1C");
		 Assert.assertEquals(370, totalAmount);
	}
	
	@Test
	public void test3() {
		PromoEngineExecutor promoEngineExecutor = new PromoEngineExecutor();
		 int totalAmount = promoEngineExecutor.executePromoEngine("3A5B1C1D");
		 Assert.assertEquals(280, totalAmount);
	}
	
	@Test
	public void test4() {
		 boolean isInValidInput = PromoEngineUtil.isInValidInput("1A1B");
		 Assert.assertEquals(Boolean.FALSE, isInValidInput);
	}
	
	@Test
	public void test5() {
		 boolean isInValidInput = PromoEngineUtil.isInValidInput("AAA");
		 Assert.assertEquals(Boolean.TRUE, isInValidInput);
	}
	
	@Test
	public void test6() {
		 boolean isInValidInput = PromoEngineUtil.isInValidInput("1234");
		 Assert.assertEquals(Boolean.TRUE, isInValidInput);
	}
	
	@Test
	public void test7() {
		 boolean isInValidInput = PromoEngineUtil.isInValidInput("11A1");
		 Assert.assertEquals(Boolean.TRUE, isInValidInput);
	}
	
	@Test
	public void test8() {
		 boolean isInValidInput = PromoEngineUtil.isInValidInput("A1B1");
		 Assert.assertEquals(Boolean.TRUE, isInValidInput);
	}
	

}
