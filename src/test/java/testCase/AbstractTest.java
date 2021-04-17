package testCase;

import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import application.Driver;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.SearchPage;
import pages.ShoppingCartPage;

public class AbstractTest {

	Logger logger; 
	WebDriver driver;
	protected HomePage homePage;
	protected LoginPage loginPage;
	protected SearchPage searchPage;
	protected ProductPage productPage;
	protected ShoppingCartPage cartPage;
	
	@Before
	public void setup() {
		
		String projectPath = System.getProperty("user.dir");
		
		String log4jConfPath = projectPath+"/src/test/resources/log4j2.properties";
		PropertyConfigurator.configure(log4jConfPath);
		logger = LoggerFactory.getLogger(AbstractTest.class.getName());
		
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = Driver.getInstance().getDriver();
		driver.manage().window().maximize();
		
		homePage = new HomePage();
		loginPage = new LoginPage();
		searchPage = new SearchPage();
		productPage = new ProductPage();
		cartPage = new ShoppingCartPage();
	}
	
	@After
	public void shutDown() {
		
		logger.info("TEST ENDED");
		
		//driver.quit();
	}
	
	
}
