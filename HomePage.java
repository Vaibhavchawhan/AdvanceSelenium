package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

//	 Identify Organization 
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement organizations;

//	 Identify Contacts
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contacts;

	// Identify Image
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement image;

	// Identify Signout
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;

	/**
	 * @return the organizations
	 */
	public WebElement getOrganizations() {
		return organizations;
	}

	/**
	 * @return the contacts
	 */
	public WebElement getContacts() {
		return contacts;
	}

	/**
	 * @return the image
	 */
	public WebElement getImage() {
		return image;
	}

	/**
	 * @return the signout
	 */
	public WebElement getSignout() {
		return signout;
	}

}
