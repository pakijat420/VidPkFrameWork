package Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import ReuseableFunctions.VidPk_Homepage_RF;

public class Verify_VidPkPages extends VidPk_Homepage_RF{


	
	public Verify_VidPkPages(WebDriver driver) {
		super(driver);
	}


	public void verifyTvPage() {
		
		
		String actual_Result = driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div[1]/h1")).getText();
		
		String expected_Result = "TV: POPULAR THIS MONTH";
		
		Assert.assertEquals(actual_Result, expected_Result);
		
		System.out.println(actual_Result);
	}
	
	
	public void verifyViralpage() {
		
		
		String actual_Result = driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div[1]/h1")).getText();
		
		String expected_Result = "VIRAL VIDEOS";
		
		Assert.assertEquals(actual_Result, expected_Result);
		
		System.out.println(actual_Result);
	}
	

}
