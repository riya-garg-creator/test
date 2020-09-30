package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.properties.propRead;

public class BrowserFactory {

	@BeforeMethod
	public static void browserOpen() throws Exception  {
		System.setProperty("webdriver.chrome.driver", propRead.propertyFile("chromePath"));
		CommonMethods.setWebdriver(new ChromeDriver());
		CommonMethods.getWebdriver().manage().window().maximize();
		CommonMethods.getWebdriver().get(propRead.propertyFile("url"));	

	}

	@AfterMethod
	public static void browserClose() {
		CommonMethods.getWebdriver().quit();
	}


}
