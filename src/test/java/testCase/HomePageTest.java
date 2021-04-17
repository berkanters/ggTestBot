package testCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomePageTest extends AbstractTest {	
	
	@Before
	public void homePageTestSetup() {
		logger.info("Homepage Check");
		
	}
	
	@After
	public void homePageTestShutDown() {
		logger.info("Homepage Done");
	}
	
	@Test
	public void checkHomePage() {
		logger.info("Check Homepage Title");
		homePage.openHomePage();
		Assert.assertTrue(driver.getTitle().equals("GittiGidiyor - Türkiye'nin öncü Alışveriş Sitesi"));
		
	}
}
