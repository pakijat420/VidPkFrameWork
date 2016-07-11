package ReuseableFunctions;

import org.openqa.selenium.WebDriver;

import ObjectRepo.VidPk_Homepage_OR;

public class VidPk_Homepage_RF extends VidPk_Homepage_OR{

	public VidPk_Homepage_RF(WebDriver driver) {
		super(driver);
		
	}
	
	public void clickonTvTab() {
		
		getTvTab().click();
	}
	
	public void clickonViralTab() {
		
		getViralTab().click();
	}
	
	public void clickonBlobTab() {
		
		getBlogTab().click();
	}
	
	public void clickonMoreTab() {
		
		getMoreTab().click();
	}

}
