package VrigerGenericUtilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepositoryVtiger.vtigerHomePage;
import objectRepositoryVtiger.vtigerLoginPage;

	public class BaseClass {

		public static WebDriver sDriver;
		public WebDriver driver;
		public FileUtilities fileLib = new FileUtilities();
		public JavaUtilities javaLib = new JavaUtilities();
		public WebDriverUtilities webLib = new WebDriverUtilities();
		public ExcelUtilities excelLib = new ExcelUtilities();
		public ExcelUtilities elLib = new ExcelUtilities();
	 
		
		@BeforeSuite(groups = {"smokeTest","regressionTest"})
		public void bs()
		{
			System.out.println("DataBase Connection");
		}
		
		@BeforeTest(groups =  {"smokeTest","regressionTest"})
		public void bt()
		{
			System.out.println("parallel execution");
		}
		
//		@Parameters("BROWSER")
		@BeforeClass(groups =  {"smokeTest","regressionTest"})
//		public void bc(String BROWSER) throws Throwable
		public void bc() throws Throwable
		{
			 String BROWSER = fileLib.getKeyAndValueData("browser");
				if (BROWSER.equalsIgnoreCase("chrome"))
				{
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
				}
				else if(BROWSER.equalsIgnoreCase("fireFox")) 
				{
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				}
				else
				{
					driver = new ChromeDriver();
				}
				
				
			System.out.println("Browser launched");
			sDriver = driver;
		}
		
		@BeforeMethod(groups = {"smokeTest","regressionTest"})
		public void bm() throws Throwable
		{
			String URL = fileLib.getKeyAndValueData("url");
			String UN = fileLib.getKeyAndValueData("userName");
			String PWD = fileLib.getKeyAndValueData("password");
			
			webLib.maximizeWindow(driver);
			webLib.WaitForElementToLoad(driver);
		    
			driver.get(URL);
			vtigerLoginPage login = new vtigerLoginPage(driver);
			login.LoginToApp(UN, PWD);
			System.out.println("login to Application");
		}
		
		@AfterMethod(groups = {"smokeTest","regressionTest"})
		public void am()
		{
			vtigerHomePage HomePage = new vtigerHomePage(driver);
			HomePage.logOutFromApp();
			System.out.println("logout from application");
		}
		
		@AfterClass(groups =  {"smokeTest","regressionTest"})
		public void ac()
		{
			
			webLib.quit(driver);
			System.out.println("close browser");
		}
		
		@AfterTest(groups =  {"smokeTest","regressionTest"})
		public void at()
		{
			System.out.println("parallel execution done");
		}
		
		@AfterSuite(groups = {"smokeTest","regressionTest"})
		public void as()
		{
			System.out.println("close database");
		}
}
