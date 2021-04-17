package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import application.Driver;

public class SearchPage {

	WebDriver driver = Driver.getInstance().getDriver();

	By searchKey = By.name("k");
	By searchButton = By.xpath("//button[@class='qjixn8-0 sc-1bydi5r-0 hKfdXF']");
	
	public void performSearch() {
		searchItem();
	}
	
	private void searchItem() {
		
		driver.findElement(searchKey).sendKeys("bilgisayar");
		driver.findElement(searchButton).click();
	}
	
	public String openSecondPage() {
		
		String hrefLink = driver.findElement(By.xpath("//*[@id='best-match-right']/div[5]/ul/li[2]/a")).getAttribute("href");		
		driver.get(hrefLink);
		return hrefLink;
	}
	
}
