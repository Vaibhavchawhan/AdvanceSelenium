package Basic_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyntraTest_AllAnnotation {

	@BeforeMethod
	public void BM() {
		System.out.println("Before method");
	}

	@AfterMethod
	public void AM() {
		System.out.println("After method");
	}

	@Test
	public void Facebook() {
		System.out.println("Facebook");
	}

	@Test
	public void ZARA() {
		System.out.println("ZARA");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("BEFORE CLASS");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("After CLASS");
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("BEFORE TEST");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("After TEST");
	}
	
	@BeforeSuite
	public void BS() {
		System.out.println("BEFORE SUIT");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println(" OUTSIDE AFTER SUIT");
	}

}
