package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationInformationPage {

	// Identify Organization Name
	@FindBy(name = "accountname")
	private WebElement organizationnametf;

	// Identify Group Radio button
	@FindBy(xpath = "(//input[@name='assigntype'])[2]")
	private WebElement groupbtn;

	// Identify DropDown
	@FindBy(name = "assigned_group_id")
	private WebElement dropdown;

	// Identify Save Button
	@FindBy(xpath = "(//input[@name='button'])[1]")
	private WebElement savebtn;

	// Identify Image
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement image;

	// Identify Signout
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;

	/**
	 * @return the savebtn
	 */
	public WebElement getSavebtn() {
		return savebtn;
	}

	/**
	 * @return the dropdown
	 */
	public WebElement getDropdown() {
		return dropdown;
	}

	/**
	 * @return the groupbtn
	 */
	public WebElement getGroupbtn() {
		return groupbtn;
	}

	public WebElement getOrganizationnametf() {
		return organizationnametf;
	}

}
