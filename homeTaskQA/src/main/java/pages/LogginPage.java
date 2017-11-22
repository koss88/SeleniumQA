package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Properties;

public class LogginPage {
    private WebDriver driver;

    private By emailInput = By.id("email");
    private By passInput = By.id("passwd");
    private By loginBtn = By.name("submitLogin");
    private String Email = "webinar.test@gmail.com";
    private String Pass = "Xcg7299bnSmMuRLp9ITw";

    public LogginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LogginPage() {

    }

    public void open(){
        driver.get(Properties.getBaseUrl());
    }
    public void fillEmail(){
        driver.findElement(emailInput).sendKeys(Email);
    }
    public void fillPass(){
        driver.findElement(passInput).sendKeys(Pass);
    }
    public void submit(){
        driver.findElement(loginBtn).click();
    }
}
