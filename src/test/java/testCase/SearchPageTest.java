package testCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchPageTest extends AbstractTest {
	
	@Before
	public void testSetup() {

		logger.info("Search Page Check");
	}
	
	@After
	public void testShutDown() {
		
		logger.info("Search Page Check Done");
	}
	
	@Test
	public void checkSearchPage() {
		
		logger.info("Check Search Page");
		searchPage.performSearch();
		String hrefLink = searchPage.openSecondPage();
		Assert.assertTrue(driver.getCurrentUrl().equals(hrefLink));
		
	}
}
