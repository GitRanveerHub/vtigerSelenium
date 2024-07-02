package testNg;

import org.testng.annotations.Test;

public class SampleTest {

//	@Test(priority = -3)
	@Test(invocationCount = 3)
	
	public void createProduct() 
	{
		System.out.println("Lele Ban gaya");
	}
	
//	@Test(dependsOnMethods = "createProduct")
//	@Test(priority = -2)
	@Test(enabled = false)
	public void modifyProduct() 
	{
		System.out.println("Muh mein lele");
	}
	
//	@Test(dependsOnMethods = "createProduct")
	@Test(priority = -1)
	public void deleteProduct() 
	{
		System.out.println("Le madarchod");
	}
}

