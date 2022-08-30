package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JsAlerts {

    private WebDriver driver;
    private By jsAlertButton = new By.ByXPath("//button[text()=\"Click for JS Alert\"]");
    private By textAlert = new By.ByXPath("//p[@id=\"result\"]");
    private By jsConfirmButton = new By.ByXPath("//button[text()='Click for JS Confirm']");
    private By jsConfirmCss = new By.ByCssSelector("button[onclick='jsConfirm()']");
    private By confirmText = By.cssSelector("#result");
    private By jsPrompButton = By.cssSelector("button[onclick='jsPrompt()']");

    public JsAlerts(WebDriver driver){
        this.driver=driver;
    }


    public void clickAlert(){
        driver.findElement(jsAlertButton).click();
    }

    public void clickConfirm(){
        driver.findElement(jsConfirmButton).click();
    }

    public void clickJsPromp(){
        driver.findElement(jsPrompButton).click();
    }


    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void typeOnPromp(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getTextResult(){
        return driver.findElement(textAlert).getText();
    }

    public String getConfirmText(){
        return driver.findElement(confirmText).getText();
    }



}


