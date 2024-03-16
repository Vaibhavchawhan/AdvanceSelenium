package BasicPOM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import CommonUtils.PropertyFileUtils;
import POM.HomePage;
import POM.LoginPage;

public class RefreshUsername {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {


	// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoapp.skillrary.com/");
		
//		click login
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		
//		Enter admin in email TF
		WebElement emailTF = driver.findElement(By.id("email"));
		emailTF.sendKeys("admin");

//		refresh
		driver.navigate().refresh();
		
//		Enter user in email TF
		emailTF.sendKeys("user");

	}

}
