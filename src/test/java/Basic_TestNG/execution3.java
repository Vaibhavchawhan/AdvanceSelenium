package Basic_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class execution3 {
	
	// for Parallel Execution--> Class
	
	@Test
	public void AjioTest() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ajio.com/");

	}

	
	@Test
	public void GoogleTest(){
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
