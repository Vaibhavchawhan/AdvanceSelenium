package Basic_DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logi_facebook {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.facebook.com/");
		// Step1: create Object of FileInputStream class & In FileInputStream enter the
		// path location
		// --> add the args-->copy the path entile the src properties file
		FileInputStream fis = new FileInputStream("src/test/resources/facebook.properties");

		// step2: create the Object of properties class
		Properties properties = new Properties();

		// step3: Call Load() to fetch the Location of External file
		properties.load(fis);

		// Step4: Call get Property(String key) to fetch the key
		String URL = properties.getProperty("Url");
		String EMAIL = properties.getProperty("Email");
		String PASS = properties.getProperty("Password");

		driver.get(URL);
		//Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(EMAIL);

		driver.findElement(By.id("pass")).sendKeys(PASS);

		// driver.findElement(By.xpath("//a[text()='LOGIN']")).click();

	}

}
