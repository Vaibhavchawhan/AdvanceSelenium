package BasicPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import CommonUtils.ExcelUtils;
import CommonUtils.JavaUtils;
import CommonUtils.PropertyFileUtils;
import CommonUtils.WebDriverUtils;
import POM.ContactInformationPage;
import POM.ContactsPage;
import POM.HomePage;
import POM.LoginPage;

public class BasePageCONTACT {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		// Object Creation
		PropertyFileUtils putil = new PropertyFileUtils();
		ExcelUtils eutil = new ExcelUtils();
		WebDriverUtils wutil = new WebDriverUtils();
		JavaUtils jutil = new JavaUtils();

		// To read the Data From Property file
		String BROWSER = putil.getDataFromPropertyFile("Browser");
		String URL = putil.getDataFromPropertyFile("Url");
		String USERNAME = putil.getDataFromPropertyFile("Username");
		String PASSWORD = putil.getDataFromPropertyFile("Password");

		// To read the Data From Excel file
		String LASTNAME = eutil.getDataFromExcel("Contacts", 1, 1);
		String GROUP = eutil.getDataFromExcel("Contacts", 2, 1);
		String ORGNAME = eutil.getDataFromExcel("Contacts", 3, 1);
		String CHILDURL = eutil.getDataFromExcel("Contacts", 4, 1);
		String PRTURL = eutil.getDataFromExcel("Contacts", 5, 1);

		// To Launch The Browser
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

		// Create Object of Home page
		HomePage hp = new HomePage(driver);
		hp.HomeContact();

		// Create Object of ContactPage
		ContactsPage cp = new ContactsPage(driver);
		cp.Contacts();
		Thread.sleep(2000);
		// Create Object of ContactInformationPage
		ContactInformationPage cip = new ContactInformationPage(driver);
		cip.ContactInformation(LASTNAME + jutil.getRandomNumber(), GROUP, ORGNAME);
		Thread.sleep(2000);
		// craete organization
	//	cip.addOrg(driver, CHILDURL, ORGNAME, PRTURL);

		// Click on signout
		Thread.sleep(2000);
		hp.Home(driver);

	}
}
