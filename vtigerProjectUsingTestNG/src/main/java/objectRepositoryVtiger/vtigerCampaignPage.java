package objectRepositoryVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vtigerCampaignPage {

	public vtigerCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement CampaignPlusSign;
	
	@FindBy(name = "campaignname")
	private WebElement campaignName;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement plusSignToNavigateProductPage;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
    private WebElement saveButton;

	
	
	public WebElement getCampaignName() {
		return campaignName;
	}
	
	public WebElement getPlusSignToNavigateProductPage() {
		return plusSignToNavigateProductPage;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public WebElement getCampaignPluuSign() {
		return CampaignPlusSign;
	}
	
	public void clickCreateCampaignPlusLink() {
		CampaignPlusSign.click();
	}
	
	public void clickProductPlusSign()
	{
		plusSignToNavigateProductPage.click();
	}
	
	public void enterCampaignName(String CampaignName)
	{
		campaignName.sendKeys(CampaignName);
	}
	
	public void campaign(String CampaignName)
	 {
		campaignName.sendKeys(CampaignName);
	 }

	public void clickOnSaveButton()
	 {
		 saveButton.click();
	 }	
		
}
