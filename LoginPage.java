package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

//	 Identify Username TF
	@FindBy(name = "user_name")
	private WebElement usernametf;

//	 Identify Password TF
	@FindBy(name = "user_password")
	private WebElement passwordtf;

//	 Identify Login button  
	@FindBy(id = "submitButton")
	private WebElement loginbtn;

	/**
	 * @return the usernametf
	 */
	public WebElement getUsernametf() {
		return usernametf;
	}

	/**
	 * @return the passwordtf
	 */
	public WebElement getPasswordtf() {
		return passwordtf;
	}

	/**
	 * @return the loginbtn
	 */
	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
