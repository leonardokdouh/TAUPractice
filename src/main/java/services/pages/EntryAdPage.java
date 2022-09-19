package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EntryAdPage {

    private WebDriver driver;
    private By closingModal = By.xpath("//div[@class='modal-footer']//p");


    public EntryAdPage(WebDriver driver){
        this.driver=driver;
    }

    public void closeModal(){
        WebElement box = driver.findElement(closingModal);
        Actions act = new Actions(driver);
        act.moveToElement(box).click().perform();


    }



}
