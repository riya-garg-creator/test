package pageFactory;

import org.openqa.selenium.support.PageFactory;

import pageObject.faq;
import pageObject.Login;
import pageObject.createAccount;
import utilities.CommonMethods;

public class PagefactoryInitializer extends CommonMethods {
	
	    public static Login loginPage() {
	        return PageFactory.initElements(CommonMethods.getWebdriver(), Login.class);
	    }
	
	    public static createAccount createAccount() {
	        return PageFactory.initElements(CommonMethods.getWebdriver(), createAccount.class);
	    }
	    
	    public static faq faqPage() {
	        return PageFactory.initElements(CommonMethods.getWebdriver(), faq.class);
	    }
	
}
