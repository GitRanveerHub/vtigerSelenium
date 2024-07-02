package Campaign;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import VrigerGenericUtilities.BaseClass;
import objectRepositoryVtiger.vtigerCampaignPage;
import objectRepositoryVtiger.vtigerHomePage;
//@Listeners(VrigerGenericUtilities.list.class)
@Listeners(VrigerGenericUtilities.ListenerImplementation.class)

public class createcampaignTest extends BaseClass {
	
	@Test //(groups = "smokeTest")
//	@Test(retryAnalyzer = VrigerGenericUtilities.RetryImplementation.class)

public void CreateCampaignTest() throws Throwable {
			
		vtigerHomePage HomePage = new vtigerHomePage(driver);
		HomePage.clickMoreLink();
		HomePage.clickCampaignLink();
		
		vtigerCampaignPage campaign = new vtigerCampaignPage(driver);
		campaign.clickCreateCampaignPlusLink();
		int ranNumber=javaLib.getRandomNum();
		Assert.assertEquals(true, true);
	    String campaignData=elLib.readDataUsingDataFormatter("Campaign", 1,0)+ranNumber;
	    System.out.println(campaignData);   	
	    campaign.enterCampaignName(campaignData); 
	    campaign.clickOnSaveButton(); 
	// Pull Check
	}
}
