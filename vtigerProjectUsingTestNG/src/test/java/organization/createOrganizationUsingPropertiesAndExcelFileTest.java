package organization;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import VrigerGenericUtilities.BaseClass;
import objectRepositoryVtiger.vtigerHomePage;
import objectRepositoryVtiger.vtigerOrganisationPage;
//@Listeners(VrigerGenericUtilities.list.class)
@Listeners(VrigerGenericUtilities.ListenerImplementation.class)

public class createOrganizationUsingPropertiesAndExcelFileTest extends BaseClass {
	
	@Test(groups = "smokeTest")
//	@Test(retryAnalyzer = VrigerGenericUtilities.RetryImplementation.class)

	public void createOrganizationUsingPropertiesAndExcelFileTestt() throws Throwable {
			 
		vtigerHomePage HomePage = new vtigerHomePage(driver);
		HomePage.clickOrgLink();
		 
		vtigerOrganisationPage orgPage = new vtigerOrganisationPage(driver);
		orgPage.clickOrgPlusSign();
		int ranNumber=javaLib.getRandomNum();
		String orgName = excelLib.readDataUsingDataFormatter("Organization",0,0)+ranNumber;
		Assert.assertEquals(true, true);
		String orgEmail = excelLib.readDataUsingDataFormatter("Organization",0,1);		
		String orgPhoneNum = excelLib.readDataUsingDataFormatter("Organization",0,2);
		orgPage.orgData(orgName, orgPhoneNum, orgEmail);
      	orgPage.clickOnSaveButton();
        Thread.sleep(2000);
	}

}
