package application;



import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.SearchPage;
import pages.ShoppingCartPage;
import util.ControlUtil;

public class Application {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		
		WebDriver driver = Driver.getInstance().getDriver();
		driver.manage().window().maximize();
		
		HomePage homePage = new HomePage();
		LoginPage loginPage = new LoginPage();
		SearchPage searchPage = new SearchPage();
		ProductPage product = new ProductPage();
		ShoppingCartPage cart = new ShoppingCartPage();
		ControlUtil controller = new ControlUtil();
		
		homePage.openHomePage();
		String mainPageTitle = driver.getTitle();
		controller.homePageCheck(mainPageTitle);
		
		loginPage.loginToPage();
		controller.checkLogin();
		
		searchPage.performSearch();
		String hrefLink = searchPage.openSecondPage();
		controller.checkPage(hrefLink);
		
		String pagePrice = product.getProductPrice();
		String cartPrice = cart.getShoppingCartPrice();
		controller.checkPrice(pagePrice, cartPrice);
		
		String amount = cart.addOneMoreProductAndGetAmount();
		controller.checkAmount(amount);
		
		cart.deleteCartProduct();
		
		
	}

}
