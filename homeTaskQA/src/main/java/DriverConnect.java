
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.*;
import utils.Properties;


public abstract class DriverConnect {
    private static WebDriver getDriver() {
        String browser = Properties.getBrowser();
        switch (browser) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", new File(DriverConnect.class.getResource
                        ("geckodriver.exe").getFile()).getPath());
                return new FirefoxDriver();
            case "chrome":
                default:
                System.setProperty("webdriver.chrome.driver", new File(DriverConnect.class.getResource
                        ("chromedriver.exe").getFile()).getPath());
                return new ChromeDriver();


        }
    }



    public static WebDriver getConfiguredDriver(){
        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        return driver;
    }
    public static void driverQuit(WebDriver driver) {driver.quit();}
    }

