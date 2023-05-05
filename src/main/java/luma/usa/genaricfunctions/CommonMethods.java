package luma.usa.genaricfunctions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import luma.usa.BasePage.SuperClass;

public class CommonMethods extends SuperClass {

	public static void HoverOver(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
	}

	public static void actionClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
	}

	public static void jsClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
	// How to handle the drop down menu
	// Ans: I can handle many way
	// A. By using select class
	// B. By suing list interface

	public static void dropdownMenu(WebElement ele, String text) {
		Select se = new Select(ele);
		// se.selectByVisibleText(text);
		// se.selectByIndex(43);
		se.selectByValue("43");

	}
	// How to handle multiple elements from drop down menu

	// In order to handle multiple elements, first of all we have to crate a
	// function with two parameter.
	// One is Web-Elements & another is string parameter
	// because we need to pass the argument in run time, so that we do not have to
	// create this method over and over.

	public static void handledropdown(List<WebElement> elements, String text) {// List can handle multiple web elements
		// Then initialize list of Web-Elements, passing arguments method
		// parameter(ele).
		List<WebElement> select = elements;
		// After that we have to create advance loop so select the text or value.
		for (WebElement value : select) {
			String listOfDropDown = value.getText();
			// Then we create a condition to get the actual value.
			if (listOfDropDown.equalsIgnoreCase(text)) {
				// If found the value the click the value.
				CommonMethods.actionClick(value);
			}
		}

	}

	public static void getPageRefresh() {// refresh the browser page
		driver.navigate().refresh();

	}
}
