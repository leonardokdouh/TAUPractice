package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By clickBox = By.cssSelector("#hot-spot");


    public ContextMenuPage(WebDriver driver){
        this.driver=driver;
    }



    public void contextRightClick(){
        WebElement box = driver.findElement(clickBox);
        Actions action = new Actions(driver);
        action.moveToElement(box).contextClick().perform();

    }

    public String acceptAlert (){
       return driver.switchTo().alert().getText();
    }



}
