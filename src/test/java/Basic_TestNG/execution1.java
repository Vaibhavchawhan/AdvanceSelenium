package Basic_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class execution1 {

	// for Group Execution

	@Test(groups = "Shopping")
	public void MyntraTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");

	}

	@Test(groups = "Food")
	public void ZomatoTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
	}

	@Test(groups = "Food")
	public void SwiggyTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");

	}

	@Test(groups = "Shopping")
	public void FlipkartTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

}
