package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import application.Driver;
import constant.IConstant;

public class LoginPage {
			
	WebDriver driver = Driver.getInstance().getDriver();
	
	By username = By.id("L-UserNameField");
	By password = By.id("L-PasswordField");
	By loginButton = By.id("gg-login-enter");
	
	public void loginToPage() {
		
		driver.get(IConstant.LOGIN_PAGE_URL);
		typeUserName();
		typePassword();
		clickLoginButton();
	}
	
	public void typeUserName() {
		
		driver.findElement(username).sendKeys(IConstant.USERNAME);
	}
	
	public void typePassword() {
		
		driver.findElement(password).sendKeys(IConstant.PASSWORD);
	}

	public void clickLoginButton() {
		
		driver.findElement(loginButton).click();
	}

}
