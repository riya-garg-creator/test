package utilities;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods extends BrowserFactory {
	
	protected static WebDriver driver;

	public static WebDriver getWebdriver() {
		return driver;
	}

	public static void setWebdriver(WebDriver driver) {
		CommonMethods.driver = driver;
	}

	public static void sendKeys(WebElement e, String txt) {
		e.sendKeys(txt);
	}

	public static void clear(WebElement e) {
		e.clear();
	}


	public static void click(WebElement e) {
		e.click();
	}

	public static String getText(WebElement e) {
		return e.getText();
	}


	public static void selectElement (WebElement options, String selectData) {
		Select sc = new Select(options);
		List<WebElement> list = sc.getOptions();
		for(int i=0; i < list.size(); i++) {
			if(list.get(i).getText().equalsIgnoreCase(selectData)){
				list.get(i).click();
				break;
			}
		}

	}

	public static void elementFromList(List<WebElement> list, String selectData ) { 
		for(int i=0; i < list.size(); i++) {
			if(list.get(i).getText().equals(selectData)){
				list.get(i).click();
				break;
			}
		}
	}

	public static boolean isDisplayed(WebElement e) {

		try {
			if(e.isDisplayed()) {
				return true;
			}
		} catch (NoSuchElementException exception) {
			return false;
		} catch (Exception exception) {
			return false;
		}
		return false;
	}

	public static void alertswitch() {
		String MainWindow=getWebdriver().getWindowHandle();	
		for(String winHandle : getWebdriver().getWindowHandles()) {
			if (!winHandle.equalsIgnoreCase(MainWindow)) {
				getWebdriver().switchTo().window(winHandle);
			}
		}
	}


	public static void scrollbar(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void selectDate(WebElement dateBox, WebElement monthSelect, WebElement yearSelect,  List<WebElement> datesList, String month, String date, String year) {
		CommonMethods.click(dateBox);
		CommonMethods.selectElement(monthSelect, month);
		CommonMethods.selectElement(yearSelect, year);
		CommonMethods.elementFromList(datesList,date);
	}
	

	public static void switchWindow(String title) {

		String currentWindow = getWebdriver().getWindowHandle();
		for(String winHandle : getWebdriver().getWindowHandles()) {	
			if (getWebdriver().switchTo().window(winHandle).getTitle().contains(title)) {
				getWebdriver().switchTo().window(winHandle);
				break;
			} else {
				getWebdriver().switchTo().window(currentWindow);
			} 
		}
	}

	public static void switchWindowUsingURL(String url) {

		String currentWindow = getWebdriver().getWindowHandle();  
		for(String winHandle : getWebdriver().getWindowHandles()) {
			if (getWebdriver().switchTo().window(winHandle).getCurrentUrl().contains(url)) {
				getWebdriver().switchTo().window(winHandle);
				break;
			} else {
				getWebdriver().switchTo().window(currentWindow);
			} 
		}
	}


}
