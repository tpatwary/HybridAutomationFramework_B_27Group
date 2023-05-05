package luma.usa.genaricfunctions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static String getScreenshot(WebDriver driver, String name) {
		
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

}
