package objectRepositoryVtiger;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vtigerDeleteProductPage {
	
	public vtigerDeleteProductPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteButton;
	
	public void deleteProduct(WebDriver driver, String productName)
	{
		 driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr//td//a[text()='"+productName+"']/../preceding-sibling::td//input[@type='checkbox']")).click();
	}
	
	public void clickOnDeleteButton()
	{
		deleteButton.click();
	}
	
	public void validateDeletedProduct(WebDriver driver, String productData)
	{
		 List<WebElement> productList = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr/td[3])[position()>1]")); 
	    	
			boolean flag = false;
			
			for (WebElement prdName : productList)
			{
				String actData = prdName.getText();
				if(actData.contains(productData))
				{
					flag=true;
				   break;
				}}
			if(flag)
			{
				System.out.println("Product data is deleted");
			}
			else
			{
				System.out.println("Product data is not deleted");
			}
	}

}
