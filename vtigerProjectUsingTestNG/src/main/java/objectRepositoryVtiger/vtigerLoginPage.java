package objectRepositoryVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vtigerLoginPage {
	
	//initialization
		public vtigerLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//Declaration
		@FindBy(name="user_name")
		private WebElement userTextField;
		
		@FindBy(name="user_password")
		private WebElement passWordTextField;
		
		@FindBy(id="submitButton")
		private WebElement loginButon;

		//getterMethods
		public WebElement getUserTextField() {
			return userTextField;
		}

		public WebElement getPassWordTextField() {
			return passWordTextField;
		}

		public WebElement getLoginButon() {
			return loginButon;

		}
		
		/**
		 * This method is used to launch the application
		 * @param userName
		 * @param password
		 * @author Ranveer
		 */
		
		public void LoginToApp(String userName, String password) {
			userTextField.sendKeys(userName);
			passWordTextField.sendKeys(password);
			loginButon.click();
		}
}
