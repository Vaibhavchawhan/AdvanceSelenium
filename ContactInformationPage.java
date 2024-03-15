package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtils.WebDriverUtils;

public class ContactInformationPage {

	public WebDriver driver;

	WebDriverUtils wutil = new WebDriverUtils();

	// Identify Contact LastName
	@FindBy(name = "lastname")
	private WebElement contactlastnametf;

	// Identify Organization Name
	@FindBy(name = "account_name")
	private WebElement organizationnametf;

	// Identify Save Button
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement savebtn;

	// Identify Image
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement image;

	// Identify Signout
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;
	// -------------------------------------------------------------
	// Add oranization
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif'][1]")
	private WebElement addorgimg;

	// search text child
	@FindBy(id = "search_txt")
	private WebElement searchtext;

	// click on search
	@FindBy(name = "search")
	private WebElement search;

	// click on org name
	@FindBy(xpath = "//a[text()='Google45']")
	private WebElement clickorgname;

	// -=-=-=--==-=------------------------------------------

	/**
	 * @return the wutil
	 */
	public WebDriverUtils getWutil() {
		return wutil;
	}

	/**
	 * @return the addorgimg
	 */
	public WebElement getAddorgimg() {
		return addorgimg;
	}

	/**
	 * @return the searchtext
	 */
	public WebElement getSearchtext() {
		return searchtext;
	}

	/**
	 * @return the search
	 */
	public WebElement getSearch() {
		return search;
	}

	/**
	 * @return the clickorgname
	 */
	public WebElement getClickorgname() {
		return clickorgname;
	}

	/**
	 * @return the savebtn
	 */
	public WebElement getSavebtn() {
		return savebtn;
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

	/**
	 * @return the organizationnametf
	 */
	public WebElement getOrganizationnametf() {
		return organizationnametf;
	}

	// identify the group radio button
	@FindBy(xpath = "(//input[@value='T'])")
	private WebElement grouprediobtn;

	// Identify DropDown
	@FindBy(name = "assigned_group_id")
	private WebElement dropdown;

	/**
	 * @return the grouprediobtn
	 */
	public WebElement getGrouprediobtn() {
		return grouprediobtn;
	}

	/**
	 * @return the dropdown
	 */
	public WebElement getDropdown() {
		return dropdown;
	}

	/**
	 * @return the contactlastnametf
	 */
	public WebElement getContactlastnametf() {
		return contactlastnametf;
	}
//==============================================================================================

	// create constructor
	public ContactInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Create Method
	public HomePage ContactInformation(String contlastNamedata, String groupCondata, String orgnamedata) {
		// Enter Contact Last nAme
		contactlastnametf.sendKeys(contlastNamedata);
		// Enter Contact Organization nAme
		organizationnametf.sendKeys(orgnamedata);
		// click on group radio btn
		grouprediobtn.click();
		// select Team selling group dropdown
		wutil.handledropdown(dropdown, groupCondata);
		// click on save button
		savebtn.click();

		return new HomePage(driver);
	}

	// Create addOrganization method
	public void addOrg(WebDriver driver, String childurl, String orgname, String paranturl) {
		// add orn name
		addorgimg.click();
		// swichtochildurl
		wutil.swichwindow(driver, childurl);
		// click search text
		searchtext.click();
		// search
		search.sendKeys(orgname);
		// click on org name
		clickorgname.click();
		// swichtochildurl
		wutil.swichwindow(driver, paranturl);

	}

}
