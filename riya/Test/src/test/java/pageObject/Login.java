package pageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BrowserFactory;
import utilities.CommonMethods;

public class Login extends BrowserFactory {


	@FindBy(xpath ="//a[contains(text(),'Already Registered')]")
	static WebElement alreadyRegister_link;

	@FindBy(xpath = "//button[@type='submit']")
	static WebElement submit_btn ;

	@FindBy(xpath = "//p[contains(text(),'Please enter a valid email address to continue.')]")
	static WebElement email_validation;

	public static WebElement  getEmailValidation() {
		return email_validation;
	}


	public  void Login_Inline_Error() {
		CommonMethods.click(alreadyRegister_link);
		CommonMethods.click(submit_btn);
	}



}
