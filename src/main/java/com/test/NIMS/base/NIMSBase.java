package com.test.NIMS.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NIMSBase {

	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;

	public NIMSBase() {

		prop = new Properties();
		try {
			FileInputStream fileInput = new FileInputStream(System.getProperty("user.dir")
					+ "//src//main//java//com//test//NIMS//" + "config//config.properties");
			prop.load(fileInput);

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
 
	public static void launch() {

		String browserType = prop.getProperty("browser");

		if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
			wait = new WebDriverWait(driver, 10);

		} else if (browserType.equalsIgnoreCase("firefox")) {
			// TODO write code for Firefox
		}
			
		else if(browserType.equalsIgnoreCase("safari")) {

		}
		else
			if(browserType.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.edge.driver","C:\\MicrosoftWebDriver.exe");
				EdgeOptions options = new EdgeOptions();
		
		   //   options.addArguments("disable-infobars");
				driver = new EdgeDriver(options);
				wait = new WebDriverWait(driver, 10);
			}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}