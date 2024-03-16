package Basic_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class execution2 {
	
	// for Parallel Execution--> Methods

	@Test
	public void MyntraTest() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");

	}

	@Test
	public void ZomatoTest(){
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.zomato.com/");
	}
	
	@Test
	public void SwiggyTest() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.swiggy.com/");

	}

	@Test
	public void FlipkartTest(){
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
}
