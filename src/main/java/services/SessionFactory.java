package services;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SessionFactory {

    private static SessionFactory InstanceSession= new SessionFactory();

    private static Capabilities browserOptions = new ChromeOptions();

    private static WebDriver driver = new RemoteWebDriver(browserOptions);

    private SessionFactory() {
    }

    public WebDriver getDriver() {
        return getDriver();
    }

    public static SessionFactory openSession() {
        if (InstanceSession != null) {
            return InstanceSession;
        } else {
        return new SessionFactory();
        }
    }

}
