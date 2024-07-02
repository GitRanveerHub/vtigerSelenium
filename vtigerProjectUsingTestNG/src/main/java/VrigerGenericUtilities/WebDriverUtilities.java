package VrigerGenericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

	/**
	 * this is used for maximizing window.
	 * @author Ranveer
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * this is used for Minimize window.
	 * @author Ranveer
	 * @param driver
	 */
	
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	/**
	 * this is used for Implicit window.
	 * @author Ranveer
	 * @param driver
	 */
	public void WaitForElementToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	/**
	 * This is used to Switch windows from one to next
	 * @param driver
	 * @param partialText
	 */
	public void switchingWindows(WebDriver driver, String partialText) {
		
		 Set<String> wins = driver.getWindowHandles();
	       Iterator<String> it = wins.iterator();
	          while(it.hasNext())
	        {
	     	   String win = it.next();
	     	   driver.switchTo().window(win);
	     	   String currentTitle1 = driver.getTitle();
	     	   if(currentTitle1.contains("partialText"))
	     	   {
	     		   break;
	     	   }
	        }
	}
	
	
	public void switchingWindows2(WebDriver driver, String partialText) {
		
		 Set<String> wins = driver.getWindowHandles();
	       Iterator<String> it = wins.iterator();
	          while(it.hasNext())
	        {
	     	   String win = it.next();
	     	   driver.switchTo().window(win);
	     	   String currentTitle1 = driver.getTitle();
	     	   if(currentTitle1.contains("partialText"))
	     	   {
	     		   break;
	     	   }
	        }
	}
	
	public void switchingWindows3(WebDriver driver, String partialText) {
		
		 Set<String> wins = driver.getWindowHandles();
	       Iterator<String> it = wins.iterator();
	          while(it.hasNext())
	        {
	     	   String win = it.next();
	     	   driver.switchTo().window(win);
	     	   String currentTitle1 = driver.getTitle();
	     	   if(currentTitle1.contains("partialText"))
	     	   {
	     		   break;
	     	   }
	        }
	}
	
	/**
	 * this is used to close the current active window.
	 * @author Ranveer
	 * @param driver
	 */
	public void close(WebDriver driver) {
		driver.close();
	}
	
	/**
	 * this is used to quit all the windows
	 * @author Ranveer
	 * @param driver
	 */
	public void quit(WebDriver driver) {
		driver.quit();
	}
	
	/**
	 * This is used to handle the one window at a time
	 * @author ranveer
	 * @param driver
	 */
	public void getWindowHandle(WebDriver driver) {
		driver.getWindowHandle();
	}
	
	/**
	 * This is used to handle the Multiple window at a time
	 * @author ranveer
	 * @param driver
	 */
	public void getWindowHandles(WebDriver driver) {
		driver.getWindowHandles();
	}
	
	/**
	 * this is used to Alert Accept popUp.
	 * @author Ranveer
	 * @param driver
	 */
	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * this is used to Alert Dismiss popup.
	 * @author ranveer
	 * @param driver
	 */
	public void alertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * this method is used to handle drop down using Select class(SelectByIndex)
	 * @param ele
	 * @param value
	 * @author Ranveer
	 */
	public void selectByIndexApproch(WebElement ele, int value)
	{
		Select select = new Select(ele);
		select.selectByIndex(value);
	}


	/**
	 * this method is used to handle drop down using Select class(SelectByValue)
	 * @param ele
	 * @param value
	 * @author Ranveer
	 */
	public void selectByValueApproch(WebElement ele, String value)
	{
		Select select = new Select(ele);
		select.selectByValue(value);
	}

	/**
	 * this method is used to handle drop down using Select class(SelectByValue)
	 * @param ele
	 * @param value
	 * @author ranveer
	 */
	public void selectByVisibleTextApproch(WebElement ele, String text)
	{
		Select select = new Select(ele);
		select.selectByVisibleText(text);
	}

	public void moveToElement(WebDriver driver, WebElement logOutImg) {
			
	}
	
	public void WaitForElementToBeClickable(WebDriver driver , WebElement clickLastName) {
		
	}
	
	public static void takeScreenShots(WebDriver driver) throws Throwable
	{
//		TakesScreenshot takesSceenShot = (TakesScreenshot) driver;
//		File src = takesSceenShot.getScreenshotAs(OutputType.FILE);
//		File dst = new File("./ScreenShots/" + screenShotName +".png");
//		FileUtils.copyFile(src, dst);
//		return dst.getAbsolutePath();
		TakesScreenshot takesSceenShot = (TakesScreenshot) driver;
		File src = takesSceenShot.getScreenshotAs(OutputType.FILE);
		LocalDateTime dateTime = LocalDateTime.now();
		String currentDateTime = dateTime.toString().replace(":", "_").replace(" ", "_");
		File dst = new File("./ScreenShots/" +"screenShotName"+currentDateTime+".png");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return screenShotName;
		
	}
	
public static String takeScreenShot(WebDriver driver, String screenShotName) throws Throwable {
		
		TakesScreenshot takesSceenShot = (TakesScreenshot) driver;
		File src = takesSceenShot.getScreenshotAs(OutputType.FILE);
		File dst = new File("./ScreenShots/" + screenShotName +".png");
		FileUtils.copyFile(src, dst);
		return dst.getAbsolutePath();
}
}

