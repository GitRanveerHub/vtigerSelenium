package objectRepositoryVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vtigerOrganisationPage {
	
	public vtigerOrganisationPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}


	@FindBy(css = "[alt='Create Organization...']")
	private WebElement orgPlusSign;
	
	@FindBy(name="accountname")
	private WebElement orgNameArea;

	@FindBy(id="phone")
	private WebElement orgaPhoneNumArea;
	
	@FindBy(id="email1")
	private WebElement orgEmailIdArea;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
    private WebElement saveButton;


	
	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getOrgPlusSign() {
		return orgPlusSign;
	}

	public WebElement getOrgName() {
		return orgNameArea;
	}

	public WebElement getOrgaPhoneNum() {
		return orgaPhoneNumArea;
	}

	public WebElement getOrgEmailId() {
		return orgEmailIdArea;
	}
	

	public void clickOrgPlusSign() {
		orgPlusSign.click();
	}
	
	public void enterOrgName(String OrgName)
	{
		orgNameArea.sendKeys(OrgName);
	}
	
	public void enterOrgPhoneNum(String phoneNum)
	{
		orgaPhoneNumArea.sendKeys(phoneNum);
	}

	public void enterOrgEmail(String Email)
	{
		orgEmailIdArea.sendKeys(Email);
	}
	
	public void orgData(String OrgName,String phoneNum,String Email)
	 {
		orgNameArea.sendKeys(OrgName);
		orgaPhoneNumArea.sendKeys(phoneNum);
		orgEmailIdArea.sendKeys(Email);
	 }

	public void clickOnSaveButton()
	 {
		 saveButton.click();
	 }		
}
