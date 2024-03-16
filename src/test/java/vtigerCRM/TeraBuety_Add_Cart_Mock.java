package vtigerCRM;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeraBuety_Add_Cart_Mock {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tirabeauty.com/");
//		Thread.sleep(3000);
		WebElement a = driver.findElement(By.id("search"));
		a.sendKeys("perfumes");
		a.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Burberry Goddess Eau De Parfum (10ml)']")).click();

		Set<String> urlcng = driver.getWindowHandles();
		for (String string : urlcng) {
			driver.switchTo().window(string).getCurrentUrl();
		}

		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		

		driver.findElement(By.xpath("//img[@alt='cart-icon']")).click();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		// To create path To store the Sceenshot Contacts
		File destinationfile = new File("./Screenshot/terabuety.png");
		FileUtils.copyFile(tempfile, destinationfile);

	}

}
