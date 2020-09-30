package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BaseLibrary {
	
	 static EventFiringWebDriver driver;

	public static EventFiringWebDriver getDriver() {
		return driver;
	}
	
	public static void setDriver(EventFiringWebDriver driver) {
		BaseLibrary.driver = driver;
	}

	protected static WebDriver wbdriver;
	
	public static WebDriver getWbdriver() {
		return wbdriver;
	}
	
	public static void setWbdriver(WebDriver wbdriver) {
		BaseLibrary.wbdriver = wbdriver;
	}

}
