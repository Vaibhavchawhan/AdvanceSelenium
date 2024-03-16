package Basic_TestNG;

import org.testng.annotations.Test;

import CommonUtils.JavaUtils;

public class Randomnumber {
@Test
	public static void main(String[] args) {
		JavaUtils rn = new JavaUtils();
		System.out.println( rn.getRandomNumber());
	}

}
