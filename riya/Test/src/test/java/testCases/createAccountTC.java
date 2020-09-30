package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageFactory.PagefactoryInitializer;
import pageObject.Login;
import utilities.BrowserFactory;
import utilities.CommonMethods;


public class createAccountTC extends BrowserFactory  {

	SoftAssert softAssert;

	@BeforeMethod
	void softAssertInit() {
		softAssert = new SoftAssert();
	}
	
	@Test 
	void Login_Inline_Error() {
		System.out.println("in test 1");
		PagefactoryInitializer.loginPage().Login_Inline_Error();
		softAssert.assertTrue(CommonMethods.isDisplayed(Login.getEmailValidation()),"error message did not displayed on blank email submittion");
	}

	@Test
	void create_account() throws Exception {
		System.out.println("in test 2");
		PagefactoryInitializer.createAccount().createAccountForm();
		softAssert.assertTrue(CommonMethods.isDisplayed(Login.getEmailValidation()),"error message did not displayed on blank email submittion");

	}
	
	@Test 
	void createAccount_inlineError() throws Exception {
		System.out.println("in test 3");
		PagefactoryInitializer.createAccount().createAccountForm_error();
		softAssert.assertTrue(CommonMethods.isDisplayed(Login.getEmailValidation()),"error message did not displayed on blank email submittion");

	}

}
