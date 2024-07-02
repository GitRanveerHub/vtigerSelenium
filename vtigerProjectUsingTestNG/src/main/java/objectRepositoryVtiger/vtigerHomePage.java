package objectRepositoryVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import VrigerGenericUtilities.WebDriverUtilities;


public class vtigerHomePage {

	public vtigerHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Organizations")
	private WebElement OrgnizationsLink;

	public WebElement getOrgnizationsLink() {
		return OrgnizationsLink;
	}
	
	public void clickOrgLink() {
		OrgnizationsLink.click();
	}
	
	
	@FindBy(linkText="Products")
	private WebElement productLink;
	
	public WebElement getProductLink() {
		return productLink;
	}
	
	public void clickProductLink() {
		productLink.click();
	}
	
	
	@FindBy(linkText="More")
	private WebElement moreLink;
	
	public WebElement getMoreLink() {
		return moreLink;
	}
	
	public void clickMoreLink() {
		moreLink.click();
	}
	
	
	@FindBy(linkText="Campaigns")
	private WebElement campaignLink;
	
	public WebElement getCampaignLink() {
		return campaignLink;
	}
	
	public void clickCampaignLink() {
		campaignLink.click();
	}
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement logOutImg;
	
	public WebElement getLogOutImg() {
		return logOutImg;
	}

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOut;
	
	 public WebElement getSignOut() {
			return signOut;
		}

	 public void logOutFromApp()
	    {
	    	logOutImg.click();
	    	signOut.click();
	    }
	 
	 public void logOut(WebDriver driver)
	    {
	     	WebDriverUtilities wlib = new WebDriverUtilities();
	    	wlib.moveToElement(driver, logOutImg);
	    	signOut.click();
	    }

}
