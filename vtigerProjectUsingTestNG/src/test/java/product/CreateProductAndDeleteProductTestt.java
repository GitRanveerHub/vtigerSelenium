package product;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import VrigerGenericUtilities.BaseClass;
import VrigerGenericUtilities.WebDriverUtilities;
import objectRepositoryVtiger.vtigerDeleteProductPage;
import objectRepositoryVtiger.vtigerHomePage;
import objectRepositoryVtiger.vtigerProductPage;
@Listeners(VrigerGenericUtilities.list.class)
//@Listeners(VrigerGenericUtilities.ListenerImplementation.class)

public class CreateProductAndDeleteProductTestt extends BaseClass  {
	
	@Test(groups = {"regressionTest","smokeTest"})
//	@Test(retryAnalyzer = VrigerGenericUtilities.RetryImplementation.class)

		public void createProductAndDeleteProductTest() throws Throwable {
			
			WebDriverUtilities webLib = new WebDriverUtilities();
			vtigerHomePage HomePage = new vtigerHomePage(driver);
			HomePage.clickProductLink();
			int ranNumber=javaLib.getRandomNum();
		    
			vtigerProductPage productPage =new vtigerProductPage(driver);
			productPage.clickCreateProduct();
			
			Assert.assertEquals(true, true);
			String productData = excelLib.readDataUsingDataFormatter("Product",1,0)+ranNumber;
			System.out.println(productData);
			productPage.product(productData);
			productPage.clickOnSaveButton();
			HomePage.clickProductLink();
			
			vtigerDeleteProductPage productValidate = new vtigerDeleteProductPage(driver);
			productValidate.deleteProduct(driver, productData);
			productValidate.clickOnDeleteButton();
			webLib.alertAccept(driver);
		    productValidate.deleteProduct(driver, productData);
		    Thread.sleep(2000);
	}

}
