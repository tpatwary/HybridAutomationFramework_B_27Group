package luma.usa.BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuperClass {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;

	// 1st- Inside the parents class we have to create two objects Properties and
	// another one is logger
	// 2nd- we have to create a constructor bc constructor invoke implicitly. so we
	// dont need to call the logger.
	// 3rd- We have write Logger.getLogger (pass the arguments inside the ())
	// 4th- Then write down PropertyConfigurator.configure("log4J.properties");
	// 5th- Then we have to write down all the steps based on test cases.
	// Then whenever we run its generate the reports inside the log folder.

	public SuperClass() {
		// configure the logger log4j.properties
		try {
			log = Logger.getLogger("QA Lead::");
			PropertyConfigurator.configure("log4J.properties");

			// configure the properties Config.file
			prop = new Properties(); // class 1
			FileInputStream ip = new FileInputStream("./src/main/java/luma/usa/config/Config.Properties"); // class 2
																											// FileInputStream
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initialization() {

		String browser = prop.getProperty("browserName");

		if (browser.equalsIgnoreCase("Chrome")) {
			log.info(">>>>> Test Execuation will start with Chrome Browser <<<<< ");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			log.info(">>>>> Test Execuation will start with Edge Browser <<<<< ");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			log.info(">>>>> Test Execuation will start with FireFox Browser <<<<< ");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			log.info(">>>>> Thre is no browser for Test Execuation <<<<< ");

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get(prop.getProperty("QAENV"));
	}

}
