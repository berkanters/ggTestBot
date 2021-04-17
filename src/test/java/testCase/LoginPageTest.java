package testCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;




public class LoginPageTest extends AbstractTest {
	
	
	@Before
	public void loginPageTetup() {
		logger.info("Login Check");
	}
	
	@After
	public void loginPageTestShutDown() {
		logger.info("Login Check Done");
	}
	
	@Test
	public void checkLoginPage() {
		
		logger.info("Check Login Page");
		loginPage.loginToPage();
		Assert.assertTrue(driver.findElement(By.xpath("//span[.='bekobeko888752']")).getText().equals("bekobeko888752"));
		
	}
}
