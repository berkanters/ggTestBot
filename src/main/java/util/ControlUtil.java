package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import application.Driver;
import constant.IConstant;

public class ControlUtil {
	
	WebDriver driver = Driver.getInstance().getDriver();
	
	By userName = By.xpath("//span[.='bekobeko888752']");


	public void homePageCheck(String currentTitle) {
		
		if(currentTitle.equals("GittiGidiyor - T�rkiye'nin �nc� Al��veri� Sitesi")) {
			System.out.println("Main Page Loaded Successfully");
		}else {
			System.out.println("Main Page Failed to Load");
		}
	}
	
	public void checkLogin() {
		
		if(driver.getCurrentUrl().equals(IConstant.HOME_PAGE_URL)) {
			String user = driver.findElement(userName).getText();
			if (user.equals("bekobeko888752")) {
				System.out.println("Login SUCCESSFULL");
			}else {
				System.out.println("Login FAILED");
			}
		}else {
			System.out.println("Login FAILED or wrong URL");
		}
	}
	
	public void checkPrice(String pagePrice, String cartPrice) {
		
		if(pagePrice.equals(cartPrice)) {
			System.out.println("Fiyatlar ayn�");
		}else {
			System.out.println("Fiyatlar farkl�");
		}
	}
	
	public void checkPage(String expectedUrl) {
		if(driver.getCurrentUrl().equals(expectedUrl)) {
			System.out.println("True Url");
		}else {
			System.out.println("Wrong URL");
		}
	}
	
	public void checkAmount(String amount) {
		System.out.println(amount);
		if(amount.equals("2")){
			System.out.println("Amount is right it is 2");
		}else {
			System.out.println("Amount is not 2 it is:" + amount);
		}
	}
}
