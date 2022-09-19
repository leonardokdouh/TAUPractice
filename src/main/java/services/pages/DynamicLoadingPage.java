package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By firstDynamic = By.cssSelector("a[href='/dynamic_loading/1']");
    private By secondDynamic = By.cssSelector("a[href='/dynamic_loading/2']");

    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }


    public DynamicFirstPage firstLink(){
        driver.findElement(firstDynamic).click();
        return new DynamicFirstPage(driver);
    }

    public DynamicSecondPage secondLink (){
        driver.findElement(secondDynamic).click();
        return new DynamicSecondPage(driver);
    }

    public void comandAndClick(){
        WebElement rightClick = driver.findElement(secondDynamic);
        Actions action = new Actions(driver);
        action.keyDown(Keys.COMMAND).click(rightClick).perform();
    }




}
