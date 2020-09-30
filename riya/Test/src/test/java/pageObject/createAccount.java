package pageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.properties.propRead;

import utilities.BrowserFactory;
import utilities.CommonMethods;

public class createAccount extends BrowserFactory {
	
		
		@FindBy(xpath = "//input[@name='first_name']")
		static WebElement firstname_ipBox ;
		
		@FindBy(xpath = "//input[@name='last_name']")
		static WebElement lastname_ipBox ;
		
		@FindBy(xpath = "//select[@name='age']")
		static WebElement age_ipBox ;
		
		
		@FindBy(xpath = "//input[@name='address1']")
		static WebElement address_ipBox ;
		
		@FindBy(xpath = "//select[@placeholder='Province/Territory']")
		static WebElement provice_ipBox ;
		
		@FindBy(xpath = "//input[@name='zip']")
		static WebElement postcode_ipBox ;
		
		@FindBy(xpath = "//input[@name='city']")
		static WebElement city_ipBox ;
	
		
		@FindBy(xpath = "//input[@id='email_2']")
		static WebElement email_address_ipBox ;
		
        @FindBy(xpath = "//input[@name='confirm_email']")
		static WebElement confirmemail_address_ipBox ;
        
        @FindBy(xpath = "//input[@id='official_rules']")
		static WebElement rules_radiobtn;

		@FindBy(xpath = "//div[@class='profile']//button[contains(text(),'Submit')]")
		static WebElement submit_btn ;
		
		public static WebElement getSubmitBtn() {
			return submit_btn;
		}
		
		/*@FindBy(xpath = "//p[contains(text(),'Please enter a valid email address to continue.')]")
		static WebElement error_validation;

		public static WebElement  getErrorValidation() {
			return error_validation;
		}*/

		
		public void createAccountForm() throws Exception {
			CommonMethods.click(firstname_ipBox);
			CommonMethods.sendKeys(firstname_ipBox, propRead.propertyFile("first"));
			CommonMethods.click(lastname_ipBox);
			CommonMethods.sendKeys(lastname_ipBox, propRead.propertyFile("last"));
			CommonMethods.click(age_ipBox);
			CommonMethods.selectElement(age_ipBox,propRead.propertyFile("age"));
			CommonMethods.click(address_ipBox);
			CommonMethods.sendKeys(address_ipBox,propRead.propertyFile("address"));
			CommonMethods.click(city_ipBox);
			CommonMethods.sendKeys(city_ipBox,propRead.propertyFile("city"));
			CommonMethods.click(provice_ipBox);
			CommonMethods.selectElement(provice_ipBox,propRead.propertyFile("state"));
			CommonMethods.click(postcode_ipBox);
			CommonMethods.sendKeys(postcode_ipBox, propRead.propertyFile("postcode"));
			CommonMethods.click(email_address_ipBox);
			CommonMethods.sendKeys(email_address_ipBox, propRead.propertyFile("email"));
			CommonMethods.click(confirmemail_address_ipBox);
			CommonMethods.sendKeys(confirmemail_address_ipBox, propRead.propertyFile("confirm_email"));
			CommonMethods.click(rules_radiobtn);
			CommonMethods.click(submit_btn);
		}


		public void createAccountForm_error()  {
			CommonMethods.click(submit_btn);
		}


}


