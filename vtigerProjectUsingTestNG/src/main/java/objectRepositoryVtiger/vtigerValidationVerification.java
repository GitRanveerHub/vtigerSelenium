package objectRepositoryVtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class vtigerValidationVerification {

	public vtigerValidationVerification(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void campData(WebDriver driver,String campaginName )
	{
       String actData = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
	     if(actData.contains(campaginName))
	     {
	    	 System.out.println("CampaignData is matched");
	     }
	       else
	     {
	    	 System.out.println("CampaignData is not matched");
	     }
	}
	
	
	public void productInCamp(WebDriver driver,String prdName)
	{
		String actData = driver.findElement(By.xpath("//td[@id='mouseArea_Product']")).getText();
	if(actData.contains(prdName))
	{
		 System.out.println("ProductData is matched");
    }
      else
    {
   	 System.out.println("ProductData is not matched");
    }
	
	}
	
	public void orgnizationValidation(WebDriver driver,String orgName)
	{
		String actData = driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
	if(actData.contains(orgName))
	{
		 System.out.println("orgData is matched");
    }
      else
    {
   	 System.out.println("orgData is not matched");
    }
		
	}
	

	public void productOnly(WebDriver driver,String prdName)
	{
		String actData = driver.findElement(By.xpath("//td[@id='mouseArea_Product']")).getText();
	if(actData.contains(prdName))
	{
		 System.out.println("ProductData is matched");
    }
      else
    {
   	 System.out.println("ProductData is not matched");
    }
	
	}
	
}
