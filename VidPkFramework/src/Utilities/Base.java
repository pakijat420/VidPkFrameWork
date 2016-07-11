package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	public WebDriver getdriver() {
		
		return 
				driver = new FirefoxDriver();
	}

}
