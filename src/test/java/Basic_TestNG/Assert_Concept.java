package Basic_TestNG;

import org.openqa.selenium.By;
//Assert
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {

	@Test
	public void MyntraPage() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
//		Hard Assert

//**************** AssertEquals()*********************************************************
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.myntra.com/");
//		String actualurl = driver.getCurrentUrl();
//		String expectedurl = "https://www.myntra.com/";
//
//		// Call AssertEquals(boolean actual,boolean expected)
//		Assert.assertEquals(actualurl, expectedurl);
//		System.out.println(actualurl);

//		if (url.equals("https://www.myntra.com/goa")) {
//			System.out.println("Url is Matching");
//		} else {
//			System.out.println("Url is NOT Matching");
//		}

//		String actualtitle = driver.getTitle();
//		String expectedtitle = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";		
//		Assert.assertEquals(actualtitle, expectedtitle);
//		System.out.println(actualtitle);

//		************ AssertTrue() ************************************************************************

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.myntra.com/");
//		WebElement searchtf = driver.findElement(By.className("desktop-searchBar"));
		// Call AssertTrue(boolean cobdition)
//		Assert.assertTrue(searchtf.isDisplayed());
//		System.out.println("good morning");

//		Assert.assertTrue(searchtf.isSelected());
//		System.out.println("good morning");

//		Assert.assertTrue(searchtf.isEnabled());
//		System.out.println("good morning");

		// searchtf.isEnabled()---> true condituon --> pass
		// searchtf.isDisplayed()---> true condituon --> pass
		// searchtf.isSelected()---> false conditon--> fail
		
		

//		**************** AssertFalse() **************** it is opposite to AssertTrue

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.myntra.com/");
		WebElement searchtf = driver.findElement(By.className("desktop-searchBar"));
		// Call AssertFalse(boolean cobdition)
		
//		Assert.assertFalse(searchtf.isEnabled());
//		System.out.println("good morning");
		
//		Assert.assertFalse(searchtf.isDisplayed());
//		System.out.println("good morning");

		
		Assert.assertFalse(searchtf.isSelected());
		System.out.println("good morning");


		// searchtf.isEnabled()---> true condituon --> Fail
		// searchtf.isDisplayed()---> true condituon --> Fail
		// searchtf.isSelected()---> false conditon--> pass

	}

}
