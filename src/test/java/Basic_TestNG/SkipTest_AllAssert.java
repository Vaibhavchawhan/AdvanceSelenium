package Basic_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SkipTest_AllAssert {

	@Test
	public void Zomato() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
	}

	@Test
	public void Facebook() {

		// Fail the facebook
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.Facebook.com/pune";
		// HardAssert
		Assert.assertEquals(actualurl, expectedurl);

//or 	SoftAssert	
//		// Create Object of Soft Assert class
//		SoftAssert sa = new SoftAssert();
//		// Call AssertEqual (boolean actual,boolean expected)
//		sa.assertEquals(actualurl, expectedurl);
//		System.out.println("Welcome, hellow world");
//		// Assert All Method
//		sa.assertAll();

	}

	@Test (dependsOnMethods = "Facebook")
	public void Swiggy() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");

	}
}
