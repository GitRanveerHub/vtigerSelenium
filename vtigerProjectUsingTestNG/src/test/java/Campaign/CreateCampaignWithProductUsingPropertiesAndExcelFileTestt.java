package Campaign;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import VrigerGenericUtilities.BaseClass;
import VrigerGenericUtilities.ExcelUtilities;
import objectRepositoryVtiger.vtigerCampaignPage;
import objectRepositoryVtiger.vtigerHomePage;
import objectRepositoryVtiger.vtigerProductPage;
import objectRepositoryVtiger.vtigerSwitchingWindows;
//@Listeners(VrigerGenericUtilities.list.class)
@Listeners(VrigerGenericUtilities.ListenerImplementation.class)

public class CreateCampaignWithProductUsingPropertiesAndExcelFileTestt extends BaseClass {
@Test(groups = "smokeTest")
//	@Test(retryAnalyzer = VrigerGenericUtilities.RetryImplementation.class)
public void createCampaignWithProductUsingPropertiesAndExcelFileTest() throws Throwable {
	      	
		vtigerHomePage HomePage = new vtigerHomePage(driver);
		HomePage.clickProductLink();
		
		vtigerProductPage createProduct = new vtigerProductPage(driver);
		createProduct.clickCreateProduct();
		int ranNumber=javaLib.getRandomNum();
		
		Assert.assertEquals(true, true);
       	String productData = elLib.readDataUsingDataFormatter("Product",4,0)+ranNumber;
		System.out.println(productData);
		createProduct.product(productData);
		createProduct.clickOnSaveButton();
       
		HomePage.clickMoreLink();
		HomePage.clickCampaignLink();
		
		vtigerCampaignPage campaign = new vtigerCampaignPage(driver);
		campaign.clickCreateCampaignPlusLink();
		
        ExcelUtilities excelLibraryCampaign = new ExcelUtilities();
        String campaignData=excelLibraryCampaign.readDataUsingDataFormatter("Campaign", 1,0);
       	System.out.println(campaignData);   	
       	campaign.enterCampaignName(campaignData);
        
        campaign.clickProductPlusSign();
        
        webLib.switchingWindows(driver, "Products&action");
        
        vtigerSwitchingWindows campPrdPage = new vtigerSwitchingWindows(driver);
        campPrdPage.enterProductName(productData);
        campPrdPage.searchPrdName();
        campPrdPage.prdNamePresent(driver, productData);
       
       webLib.switchingWindows(driver, "Campaigns&action");
       campaign.clickOnSaveButton();
      
	}

}
