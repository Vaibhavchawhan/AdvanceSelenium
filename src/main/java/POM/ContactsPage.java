package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	public WebDriver driver;

	// click on create organization (+)
	@FindBy(xpath = "(//img[@title='Create Contact...'])")
	private WebElement CreateContact;

	/**
	 * @return the createorg
	 */
	public WebElement getCreateorg() {
		return CreateContact;
	}

	// create contructor paramitrize
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// create method-> to perform the action
	public ContactInformationPage Contacts() {
		// click on CreateContact..(+)
		CreateContact.click();
		return new ContactInformationPage(driver);
	}

}
