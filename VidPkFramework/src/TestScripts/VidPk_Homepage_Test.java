package TestScripts;

import org.testng.annotations.Test;


public class VidPk_Homepage_Test extends TestBase{
	
	@Test(priority = 1)
	public void gotoTvPage() {
		
		hmpage.clickonTvTab();
		
		verify.verifyTvPage();
		
		
	}
	
	@Test(priority = 2)
	public void gotoViralpage() {
		
		hmpage.clickonViralTab();
		
		verify.verifyViralpage();


}
	
}
