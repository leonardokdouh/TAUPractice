package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class DynamicFirstPage { 

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loading = By.cssSelector("#loading");
    private By finishText = By.cssSelector("#finish");


    public DynamicFirstPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickButton(){
        driver.findElement(startButton).click();
    //    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15) );
        //  wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));

        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));


    }

    public String returnLoadingText(){
        return driver.findElement(finishText).getText();

    }


}
