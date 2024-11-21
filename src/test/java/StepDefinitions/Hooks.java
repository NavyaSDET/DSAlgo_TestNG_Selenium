package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import java.time.Duration;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utilities.ConfigReader;


public class Hooks {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static WebDriver driver;
	public static String browser;

	@BeforeAll
	public static void before() throws Throwable {
		//Get browser Type from config file
		ConfigReader.loadConfig();
		//browser = ConfigReader.getBrowserType();
		browser = "chrome";
		
	}

    @Before
    public void deleteCookies() throws Exception {
    	String browser = "chrome";
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if(browser.equals("edge")) {
        	driver = new EdgeDriver();
        }
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        threadDriver.set(driver);
    }

    @After
    public static void closeDriver() {
        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            threadDriver.remove();
        }
    }


    public static WebDriver getDriver() {
        return threadDriver.get();
    }


}