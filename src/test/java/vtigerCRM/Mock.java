package vtigerCRM;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.flipkart.com/");
		WebElement a =w.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']"));
		a.sendKeys("bag");
		a.sendKeys(Keys.ENTER);
		w.findElement(By.xpath("(//img[@class='_2r_T1I'])[1]")).click();
		Set<String> S = w.getWindowHandles();
		
		for (String string : S) {
			String url = w.switchTo().window(string).getCurrentUrl();

		}
	      JavascriptExecutor js = (JavascriptExecutor)w;
	      js.executeScript("window.scrollBy(0,2400)");
		Thread.sleep(2000);
		 w.findElement(By.xpath("//button[text()='Add to cart']")).click();
		 
		 
		 TakesScreenshot ts= (TakesScreenshot) w;
			File tempfile = ts.getScreenshotAs(OutputType.FILE);
			File destinationfile=new File("./Screenshot/mock.png");
			FileUtils.copyFile(tempfile, destinationfile);
			
			
		 
		
	}
}
