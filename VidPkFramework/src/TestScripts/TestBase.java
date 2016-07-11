package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import ReuseableFunctions.VidPk_Homepage_RF;
import Utilities.Base;
import Utilities.ConfigReader;
import Validations.Verify_VidPkPages;


public class TestBase {
	
	Base b = new Base();
	
	WebDriver driver = b.getdriver();
	
	VidPk_Homepage_RF hmpage = PageFactory.initElements(driver, VidPk_Homepage_RF.class);
	
	ConfigReader config = PageFactory.initElements(driver, ConfigReader.class);
	
	
	Verify_VidPkPages verify = PageFactory.initElements(driver, Verify_VidPkPages.class);
	
	@BeforeClass
	public void setup () {
		
		driver.get(config.getVidPkUrl());
	}

}
