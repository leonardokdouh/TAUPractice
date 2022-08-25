package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPress {

    private WebDriver driver;
    private By textForm = new By.ByXPath("//input[@id='target']");
    private By result =  By.id("result");

    public KeyPress (WebDriver driver){
        this.driver=driver;
    }


    public void enterText(String text){
        driver.findElement(textForm).sendKeys(text);

    }

    public String getResult(){
        return driver.findElement(result).getText();
    }


    public void enterPi(){

        enterText(Keys.chord(Keys.ALT, "p")+ " = 3.14" ) ;

    }


}
