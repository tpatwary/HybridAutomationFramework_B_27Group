package luma.usa.genaricfunctions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;
import luma.usa.BasePage.SuperClass;

public class Utility extends SuperClass{
	
	public static String getScreenshot( String name) {
		
		String dateName = new SimpleDateFormat("MM.dd.yyyy-hh.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/Screenshot/" + name + dateName + ".jpg";
		File finalDestination = new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			// logger.log(Level.WARN, "Interrup ted!", e);
			Thread.currentThread().interrupt();
		}
		return destination;
	}

	public static String getScreenshots(Scenario scenario) {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		String dateName = new SimpleDateFormat("MM.dd.yyyy-hh.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/Screenshot/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		try { 
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			
			Thread.currentThread().interrupt();
		}
		return destination;
	}

}
