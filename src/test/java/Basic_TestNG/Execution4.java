package Basic_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Execution4 {

	// CrossBrowser Execution--> executing testscript in methods

	public WebDriver driver;

	@Parameters("Browser")
	@Test
	public void AjioTest(String Browser) {
		if (Browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new EdgeDriver();
		}

		driver.get("https://www.ajio.com/");

	}

//	@Test
//	public void GoogleTest() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//	}

}
