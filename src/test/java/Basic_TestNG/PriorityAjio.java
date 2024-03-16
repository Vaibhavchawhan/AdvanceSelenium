package Basic_TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityAjio {

	@Test (priority=0,invocationCount = 2)
	public void Facebook() {
		//System.out.println("Facebook");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test (priority=1)
	public void Amazon() {
		//System.out.println("Amaxon");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test (priority=2 , invocationCount = 2)
	public void Myntra() {
		//System.out.println("Myntra");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
	}

}
