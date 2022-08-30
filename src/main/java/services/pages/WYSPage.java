package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSPage {

    private WebDriver driver;
    private By textArea = By.id("tinymce");
    private String frame = "mce_0_ifr";

    public WYSPage(WebDriver driver){
        this.driver=driver;
    }


    public void clearText(){
        enterFrame();
        driver.findElement(textArea).clear();
        exitFrame();
    }

    public void sendText(String text){
        enterFrame();
        driver.findElement(textArea).sendKeys(text);
        exitFrame();
    }


    private void enterFrame(){
        driver.switchTo().frame(frame);
    }

    private void exitFrame(){
        driver.switchTo().parentFrame();
    }

}
