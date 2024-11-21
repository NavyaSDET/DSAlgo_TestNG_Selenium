package driverManager;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import Utilities.ConfigReader;



public class DriverFactory {
	
	public static Properties configProp;
	
	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>() {
		protected WebDriver initialValue() {
			configProp = ConfigReader.initializeProp();
            String browser = configProp.getProperty("browser"); // Default to Chrome if no property is set
            System.out.println("Browser Value :>>>"+browser);
            if (browser == null) {
                browser = "chrome";
            }
            switch (browser.toLowerCase()) {
                case "firefox":
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    return new FirefoxDriver(firefoxOptions);
                    
                case "edge":
                    EdgeOptions edgeOptions = new EdgeOptions();
                    return new EdgeDriver(edgeOptions);
                case "chrome":
                default:
                    ChromeOptions chromeOptions = new ChromeOptions();
                    return new ChromeDriver(chromeOptions);
            }
            
		}
	};

	public WebDriver getDriver() {
		return tlDriver.get();
	}

	public void setDriver(WebDriver driver) {
		tlDriver.set(driver);
	}

	public void removeDriver() {
		tlDriver.remove();
	}
	
	}

	