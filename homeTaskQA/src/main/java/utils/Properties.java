package utils;

import org.openqa.selenium.remote.BrowserType;
public class Properties {
    public static final String DEFAULT_BASE_URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
    public static final String DEFAULT_BROWSER = BrowserType.CHROME;
    private String value;

    public static String getBaseUrl(){
        return System.getProperty(EnvironmentVariables.BROWSER.toString(),DEFAULT_BASE_URL);
    }
public static String getBrowser(){
        return System.getProperty(EnvironmentVariables.BROWSER.toString(),DEFAULT_BROWSER);

}
enum EnvironmentVariables {
    BASE_URL("env.admin.url"),BROWSER("browser");

    private String value;

    EnvironmentVariables(String value) { this.value = value; }
}
@Override
    public String toString() {return value;}

}
