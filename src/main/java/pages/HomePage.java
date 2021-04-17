package pages;

import org.openqa.selenium.WebDriver;
import application.Driver;
import constant.IConstant;

public class HomePage {
	

	WebDriver driver = Driver.getInstance().getDriver();
	
	public void openHomePage() {
				
		driver.get(IConstant.HOME_PAGE_URL);
	}
	
	
}
