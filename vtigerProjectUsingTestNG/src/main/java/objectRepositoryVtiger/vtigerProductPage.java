package objectRepositoryVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vtigerProductPage {
	
	public vtigerProductPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createNewProductLink;
	
	@FindBy(name = "productname")
	private WebElement productName;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
    private WebElement saveButton;

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getCreateNewProductLink() {
		return createNewProductLink;
	}
	
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void clickCreateProduct() {
		createNewProductLink.click();
	}
	
	public void enterProductName(String ProductName)
	{
		productName.sendKeys(ProductName);
	}
	
	public void product(String ProductName)
	 {
		productName.sendKeys(ProductName);
	 }
	
	public void clickOnSaveButton()
	 {
		 saveButton.click();
	 }	
		
}
