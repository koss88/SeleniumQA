package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private By userIcon = By.id("employee_infos");
    private By exitBtn = By.id("header_logout");
    private By orders = By.id("subtab-AdminParentOrders");
    private By catalog = By.id("subtab-AdminCatalog");
    private By clients = By.xpath("//*[@id=\"subtab-AdminParentCustomer\"]");
    private By customer = By.id("subtab-AdminParentCustomerThreads");
    private By statist = By.id("subtab-AdminStats");

public DashboardPage (WebDriver driver){
    this.driver = driver;
}
public void clickPages(){
driver.findElement(orders).click();

String title = driver.getCurrentUrl();
System.out.println(driver.getTitle());
driver.navigate().refresh();
String title2 = driver.getCurrentUrl();
System.out.println(title.equals(title2));

driver.findElement(catalog).click();

String ctgTitle = driver.getCurrentUrl();
System.out.println(driver.getTitle());
driver.navigate().refresh();
String ctgTitle2 = driver.getCurrentUrl();
System.out.println(ctgTitle.equals(ctgTitle2));
driver.findElement(clients).click();
String cltTitle = driver.getCurrentUrl();
    System.out.println(driver.getTitle());
    driver.navigate().refresh();
    String cltTitle2 = driver.getCurrentUrl();
    System.out.println(cltTitle.equals(cltTitle2));
driver.findElement(customer).click();
String cstTitle = driver.getCurrentUrl();
System.out.println(driver.getTitle());
driver.navigate().refresh();
String cstTitle2 = driver.getCurrentUrl();
System.out.println(cstTitle.equals(cstTitle2));

driver.findElement(statist).click();
String stTitle = driver.getCurrentUrl();
    System.out.println(driver.getTitle());
    driver.navigate().refresh();
    String stTitle2 = driver.getCurrentUrl();
    System.out.println(stTitle.equals(stTitle2));

}

public void clickUsr(){
    driver.findElement(userIcon).click();
}
public void exitBtn(){
    driver.findElement(exitBtn).click();
}
}
