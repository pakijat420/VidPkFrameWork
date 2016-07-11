package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.Base;

public class VidPk_Homepage_OR extends Base{
	
	public WebDriver driver;
	public VidPk_Homepage_OR(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public By TvTab = By.xpath(".//*[@id='header']/div/div[1]/div[2]/h1/a");
	public WebElement getTvTab() {
		return 
				driver.findElement(TvTab);
	}
	
	public By ViralTab = By.xpath(".//*[@id='header']/div/div[1]/div[3]/h1/a");
	public WebElement getViralTab() {
		return 
				driver.findElement(ViralTab);
	}
	
	public By BlogTab = By.xpath(".//*[@id='header']/div/div[1]/div[4]/h1/a");
	public WebElement getBlogTab() {
		return 
				driver.findElement(BlogTab);
	}
	
	public By MoreTab = By.xpath(".//*[@id='header']/div/div[1]/div[5]/h1/a");
	public WebElement getMoreTab() {
		return 
				driver.findElement(MoreTab);
	}
	
}
