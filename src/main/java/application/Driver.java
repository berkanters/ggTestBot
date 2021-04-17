package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	private static final Driver INSTANCE = new Driver();
	private static  WebDriver driver = new ChromeDriver();
	
	private Driver() {

	}
	
	public static Driver getInstance() {
		return INSTANCE;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}

