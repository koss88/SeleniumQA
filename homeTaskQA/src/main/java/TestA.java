import org.openqa.selenium.WebDriver;
import pages.LogginPage;

public class TestA extends DriverConnect{
    public static void main(String[]args)throws InterruptedException{
        WebDriver driver = getConfiguredDriver();
        LogginPage login = new LogginPage(driver);

        login.open();
        login.fillEmail();
        login.fillPass();
        login.submit();

        

    }
}
