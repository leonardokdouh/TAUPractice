package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class DynamicSecondPage {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loading = By.cssSelector("#loading");
    private By finish = By.id("finish");


    public DynamicSecondPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(finish));

    }

    public String getFinalText(){
        return driver.findElement(finish).getText();

    }
}
