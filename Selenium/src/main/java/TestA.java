import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestA {
    public static void main(String []args) throws InterruptedException {
        WebDriver driver = initChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement login = driver.findElement(By.id("email"));
        login.sendKeys("webinar.test@gmail.com");
        WebElement pass = driver.findElement(By.id("passwd"));
        pass.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement button = driver.findElement(By.name("submitLogin"));
        button.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement picture = driver.findElement(By.id("employee_infos"));
        picture.click();
        WebElement exitButton = driver.findElement(By.id("header_logout"));
        exitButton.click();

        driver.quit();

    }
    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        return new ChromeDriver();
    }
}
