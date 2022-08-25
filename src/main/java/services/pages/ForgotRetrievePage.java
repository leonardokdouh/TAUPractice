package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotRetrievePage {
    private WebDriver driver;
    private By textPage = new By.ByXPath("//h1");


    public ForgotRetrievePage(WebDriver driver){
        this.driver=driver;
    }

    public String getText(){
        System.out.println("Asdasdasd");

        return driver.findElement(textPage).getText();
    }


}
