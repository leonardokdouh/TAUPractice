package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By userField = By.id("username");
    private By passwdField = By.id("password");
    private By logginButton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setUser(String user){
        driver.findElement(userField).sendKeys(user);
    }

    public void setPass(String pass){
        driver.findElement(passwdField).sendKeys(pass);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(logginButton).click();
        return new SecureAreaPage(driver);
    }

}
