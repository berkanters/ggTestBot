package testCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CartPageTest extends AbstractTest {
	

	
	@Before
	public void testSetup() {
		
		logger.info("Cart Page Check");
	}
	
	@After
	public void testShutDown() {
		
		logger.info("Cart Page Check Done");
	}
	
	@Test
	public void checkProduct() {
		

		logger.info("Check Price");
		String productPrice = productPage.getProductPrice();
		String cartPrice = cartPage.getShoppingCartPrice();
		Assert.assertTrue(productPrice.equals(cartPrice));
		
//		LOGGER.info("Check Amount");
		String amount = cartPage.addOneMoreProductAndGetAmount();
		Assert.assertTrue(amount.equals("2"));
		
		cartPage.deleteCartProduct();
	}

//	@Test
//	public void checkProductAmount(){
//		System.out.println("Check Amount");
//		String amount = cartPage.addOneMoreProductAndGetAmount();
//		Assert.assertTrue(amount.equals("2"));
//	}
	
//	@Test
//	public void cleanCart() {
//		cartPage.deleteCartProduct();
//	}
}
