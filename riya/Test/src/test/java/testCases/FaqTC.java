package testCases;

import org.testng.annotations.Test;

import pageFactory.PagefactoryInitializer;
import utilities.BrowserFactory;

public class FaqTC extends BrowserFactory {
	
	@Test 
		void faqForm() throws Exception {
			PagefactoryInitializer.faqPage().faqForm();
		}

}
