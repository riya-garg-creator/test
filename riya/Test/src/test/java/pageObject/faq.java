package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.properties.propRead;

import utilities.CommonMethods;

public class faq {

	@FindBy(xpath="//a[contains(text(),'FAQ')]")
	static WebElement faq_Link;

	@FindBy(xpath="//input[@id='first_name']")
	static WebElement firstname_input;

	@FindBy(xpath="//input[@id='last_name']")
	static WebElement lastname_input;

	@FindBy(xpath="//input[@id='email']")
	static WebElement email_input;

	@FindBy(xpath="//select[@name='age.birth_month']")
	static WebElement dob_month;

	@FindBy(xpath="//select[@name='age.birth_day']")
	static WebElement dob_date;

	@FindBy(xpath="//select[@name='age.birth_year']")
	static WebElement dob_year;


	@FindBy(xpath="//select[@name='issue_type']")
	static WebElement issueType_select;

	@FindBy(xpath="//textarea[@id='question']")
	static WebElement comment_input;

	@FindBy(xpath="//button[@class='btn']")
	static WebElement submit_btn;

	public void faqForm() throws Exception {
		CommonMethods.click(faq_Link);
		CommonMethods.alertswitch();
		CommonMethods.click(firstname_input);
		CommonMethods.sendKeys(firstname_input, propRead.propertyFile("first"));
		CommonMethods.click(lastname_input);
		CommonMethods.sendKeys(lastname_input, propRead.propertyFile("last"));
		CommonMethods.click(email_input);
		CommonMethods.sendKeys(email_input, propRead.propertyFile("email"));
		CommonMethods.click(dob_month);
		CommonMethods.selectElement(dob_month, propRead.propertyFile("month"));
		CommonMethods.click(dob_date);
		CommonMethods.selectElement(dob_date, propRead.propertyFile("date"));
		CommonMethods.click(dob_year);
		CommonMethods.selectElement(dob_year, propRead.propertyFile("year"));
		CommonMethods.click(issueType_select);
		CommonMethods.selectElement(issueType_select, propRead.propertyFile("issue"));
		CommonMethods.click(comment_input);
		CommonMethods.sendKeys(comment_input, propRead.propertyFile("comment"));
		CommonMethods.click(submit_btn);
	}



}
