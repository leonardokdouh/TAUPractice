package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SliderPage{

    private WebDriver driver;
    private By slider = new By.ByXPath("//input");
    private By range = new By.ByXPath("//span");

    public SliderPage(WebDriver driver){
        this.driver=driver;
    }


    public void clickBar(){
        driver.findElement(slider).click();
    }

    public void moveBar(int times){
        var right = driver.findElement(slider);
        for(int i= 0; i<times; i++) {
          right.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getRangeText(){
        return driver.findElement(range).getText();
    }

}
