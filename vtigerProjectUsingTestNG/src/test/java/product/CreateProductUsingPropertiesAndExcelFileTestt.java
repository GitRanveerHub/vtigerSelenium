package product;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import VrigerGenericUtilities.BaseClass;
import objectRepositoryVtiger.vtigerHomePage;
import objectRepositoryVtiger.vtigerProductPage;
//@Listeners(VrigerGenericUtilities.list.class)
@Listeners(VrigerGenericUtilities.ListenerImplementation.class)

public class CreateProductUsingPropertiesAndExcelFileTestt extends BaseClass {
	
	@Test//(groups = "regressionTest")
//	@Test(retryAnalyzer = VrigerGenericUtilities.RetryImplementation.class)

	public void createProductUsingPropertiesAndExcelFileTest() throws Throwable {
        
		vtigerHomePage HomePage = new vtigerHomePage(driver);
		HomePage.clickProductLink();
		int ranNumber=javaLib.getRandomNum();
		
		vtigerProductPage createProduct = new vtigerProductPage(driver);
		createProduct.clickCreateProduct();
		
		Assert.assertEquals(true, true);
		String productData = excelLib.readDataUsingDataFormatter("Product",1,0)+ranNumber;
		System.out.println(productData);
		createProduct.product(productData);
		createProduct.clickOnSaveButton();
		Thread.sleep(2000);
	}

}
