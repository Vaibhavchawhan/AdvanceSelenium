package Basic_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Asserts {

	@Test
	public void MyntraPage() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");

//		Soft Assert

//**************** AssertEquals()*********************************************************

		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.myntra.com/pune";

		// Create Object of Soft Assert class
		SoftAssert sa = new SoftAssert();
		// Call AssertEqual (boolean actual,boolean expected)
		sa.assertEquals(actualurl, expectedurl);
		System.out.println("Welcome, hellow world");

		// Assert All Method
		sa.assertAll();

	}

}
