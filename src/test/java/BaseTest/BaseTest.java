package BaseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import DriverManager.DriverManager;
import Utilities.ConfigReader;

public class BaseTest {

    DriverManager driverManager = new DriverManager();
    public WebDriver driver;
    public static String browser;

    @BeforeClass(alwaysRun = true)
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) throws Throwable {
        ConfigReader.loadConfig();
        driver = driverManager.initializeBrowser(browser);
    }

    @AfterClass(alwaysRun = true) 
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        driverManager.closeDriver();
    }

    @AfterMethod(alwaysRun = true) 
    public void clearCookies() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
        }
    }
}
