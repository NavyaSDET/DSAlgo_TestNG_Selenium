package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static String browser;
    public static WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        browser = "chrome";  // Or dynamically get browser type from config

        // Set up WebDriver based on the browser type
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equals("edge")) {
            driver = new EdgeDriver();
        }

        // Configure the driver
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Store driver in ThreadLocal
        threadDriver.set(driver);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        WebDriver driver = threadDriver.get();
        if (driver != null) {
            driver.quit();  // Close browser for the current thread
            threadDriver.remove();  // Clean up the ThreadLocal variable
        }
    }

    // Method to get the WebDriver instance for the current thread
    public static WebDriver getDriver() {
        return threadDriver.get();
    }
    
    public void deleteAllCookies() {
        driver.manage().deleteAllCookies();
    }
}
