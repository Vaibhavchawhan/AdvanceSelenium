package vtigerCRM;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonUtils.ExcelUtils;
import CommonUtils.JavaUtils;
import CommonUtils.PropertyFileUtils;
import CommonUtils.WebDriverUtils;
import CommonUtils.listenerImplimation;
@Listeners(listenerImplimation.class)
public class Contacts {

	PropertyFileUtils putil = new PropertyFileUtils();
	WebDriverUtils wutil = new WebDriverUtils();
	ExcelUtils eutil = new ExcelUtils();
	JavaUtils jutil = new JavaUtils();

	@Test
	public void ContactTest() throws IOException, InterruptedException {
		// To launch the empty browser
		WebDriver driver = new ChromeDriver();
		// To maximize the browser window
		wutil.maximize(driver);
		// To apply implicit wait for findElement()
		wutil.implicitlywait(driver);

//	 To Read the Data From Properties File	
		String URL = putil.getDataFromPropertyFile("Url");
		String USERNAME = putil.getDataFromPropertyFile("Username");
		String PASSWORD = putil.getDataFromPropertyFile("Password");

//	To Read the Data From Excel File/sheet	
		String FIRSTN = eutil.getDataFromExcel("Contacts", 0, 1);
		String LASTN = eutil.getDataFromExcel("Contacts", 1, 1);
		String GROUP = eutil.getDataFromExcel("Contacts", 2, 1);
		String ORGNAME = eutil.getDataFromExcel("Contacts", 3, 1);
		String CHILDURL = eutil.getDataFromExcel("Contacts", 4, 1);
		String PARENTURL = eutil.getDataFromExcel("Contacts", 5, 1);

//  To launch the Application
		driver.get(URL);

//	Login to application
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

//  click on Contacts
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//	click on create Contacts (+)
		driver.findElement(By.cssSelector("img[title='Create Contact...']")).click();
//  Enter Contacts name
		driver.findElement(By.name("firstname")).sendKeys(FIRSTN);
		driver.findElement(By.name("lastname")).sendKeys(LASTN);
//------------------------------------------------------------------------		
//	TO fail The TestScript --> not click in notifychechbox
		//WebElement notifychechbox = driver.findElement(By.name("notify_owner"));
		//Assert.assertTrue(notifychechbox.isSelected());
		
//	TO fail The TestScript -->	URL	
//		String actUrl=driver.getCurrentUrl();
//		String ExpUrl="http://localhost:8888/pune/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing";
//		Assert.assertEquals(actUrl, ExpUrl);
		
//-----------------------------------------------------------
//  In Assigned To Click on group radio button
		driver.findElement(By.cssSelector("input[value='T']")).click();
//	In the Drop Down Select Team Selling
		WebElement dropdown = driver.findElement(By.name("assigned_group_id"));
		wutil.handledropdown(dropdown, GROUP);

//  Enter Organization Name step1: click on(+) 2) click search Btn 3) click Org.. name  --> all are child Window
//		step
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif'][1]")).click();

// To transfer the driver control from parent window  to child window
		wutil.swichwindow(driver, CHILDURL);
// OR	// Set<String> id = driver.getWindowHandles();
		// System.out.println(id);
		// for (String ele : id) {
		// driver.switchTo().window(ele).getCurrentUrl();
		// }

		// to write organization name in TextField
		driver.findElement(By.id("search_txt")).sendKeys(ORGNAME);
		// To click on search now button
		driver.findElement(By.name("search")).click();
		// to click on org.. name -->Google
		// driver.findElement(By.id("4")).click();
		driver.findElement(By.xpath("//a[text()='Google45']")).click();

// To transfer the driver control from child window  to parent window
		wutil.swichwindow(driver, PARENTURL);

//	OR	Set<String> iddd = driver.getWindowHandles();
//		for (String string1 : iddd) {
//			driver.switchTo().window(string1).getCurrentUrl();
//		}

// To save the Contacts
		driver.findElement(By.xpath("(//input[@value='  Save  '])[1]")).click();
		
//		To take the SceenShot
		wutil.screenshot(driver, "Contacts");
		
//	Mousehover on Image
		Thread.sleep(2000);
		WebElement image = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		wutil.mousehover(driver, image);
//	sign out
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}
