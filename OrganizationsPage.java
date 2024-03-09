package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationsPage {

	// click on create organization (+)
	@FindBy(xpath = "(//img[@title='Create Organization...'])")
	private WebElement Createorg;

	/**
	 * @return the createorg
	 */
	public WebElement getCreateorg() {
		return Createorg;
	}

}
