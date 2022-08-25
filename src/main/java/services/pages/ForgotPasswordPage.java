package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By email = By.cssSelector("#email ");
    private By retrieveButtom = By.cssSelector(".icon-2x");

    public ForgotPasswordPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterEmail(String text){
        driver.findElement(email).sendKeys(text);
    }

    public ForgotRetrievePage clickButtom(){
        driver.findElement(retrieveButtom).click();
        return new ForgotRetrievePage(driver);
    }




}
