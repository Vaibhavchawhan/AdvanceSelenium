package BasicPOM;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import CommonUtils.ExcelUtils;
import CommonUtils.JavaUtils;
import CommonUtils.PropertyFileUtils;
import CommonUtils.WebDriverUtils;
import POM.HomePage;
import POM.LoginPage;
import POM.OrganizationInformationPage;
import POM.OrganizationsPage;

public class BasePageORG {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

//	Object Creation
		PropertyFileUtils putil = new PropertyFileUtils();
		ExcelUtils eutil = new ExcelUtils();
		WebDriverUtils wutil = new WebDriverUtils();
		JavaUtils jutil = new JavaUtils();

		String BROWSER = putil.getDataFromPropertyFile("Browser");
		String URL = putil.getDataFromPropertyFile("Url");
		String USERNAME = putil.getDataFromPropertyFile("Username");
		String PASSWORD = putil.getDataFromPropertyFile("Password");

//To read Data from Excel file 
		String ORGNAME = eutil.getDataFromExcel("Organization", 0, 1);
		String GROUP = eutil.getDataFromExcel("Organization", 1, 1);

//To launch the browser
		if (BROWSER.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("Edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		// launch url
		driver.get(URL);

		// maximize
		driver.manage().window().maximize();

		// Create Object of Login page
		LoginPage lp = new LoginPage(driver);
		lp.Login(USERNAME, PASSWORD);

		// to initialize the Webelements
//		PageFactory.initElements(driver, lp);--> to pass login page Constructor
		/*
		 * lp.getUsernametf().sendKeys(USERNAME); lp.getPasswordtf().sendKeys(PASSWORD);
		 * lp.getLoginbtn().click();
		 */

		// Create Object of Home page
		HomePage hp = new HomePage(driver);
		hp.Home();

		// click on organizations
		// hp.getOrganizations().click();
		// to initialize the Webelements
//		PageFactory.initElements(driver, hp); --> to pass HOME page Constructor	
//		hp.getContacts().click();
//		hp.getImage().click();
//		hp.getSignout().click();

		// Create Object of Organization page
		OrganizationsPage op = new OrganizationsPage(driver);
		op.Organizations();

//		PageFactory.initElements(driver, op);--> to pass OrganizationsPage page Constructor
		// click on create org....(+)
		// op.getCreateorg().click();

//	create Object of organizationInformationPage
		OrganizationInformationPage oip = new OrganizationInformationPage(driver);
		oip.OrganizationInformation(ORGNAME + jutil.getRandomNumber(), GROUP);
	
//		PageFactory.initElements(driver, oip);  --> to pass OrganizationInformationPage page Constructor
		// Enter Organization name
		// oip.getOrganizationnametf().sendKeys(ORGNAME + jutil.getRandomNumber());
		// click on radio btn
		// oip.getGroupbtn().click();
		// select support group in dropdown
		// wutil.handledropdown(oip.getDropdown(), GROUP);
		// click on save button
		// oip.getSavebtn().click();

		Thread.sleep(2000);
		hp.Home(driver);

		// mouse hover on image
		// wutil.mousehover(driver, hp.getImage());

		// sign out button
		// hp.getSignout().click(); 

	}

}