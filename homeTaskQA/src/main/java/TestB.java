import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LogginPage;

import java.util.concurrent.TimeUnit;

public class TestB extends DriverConnect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getConfiguredDriver();
        LogginPage login = new LogginPage(driver);



        login.open();
        login.fillEmail();
        login.fillPass();
        login.submit();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DashboardPage dash = new DashboardPage(driver);
        dash.clickPages();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


dash.clickUsr();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
dash.exitBtn();


driver.quit();
    }
}