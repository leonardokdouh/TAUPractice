package services.pages;

import org.openqa.selenium.*;

public class LargeAndDeepPage {

    private WebDriver driver;
    private By table = By.id("large-table");

    public LargeAndDeepPage(WebDriver driver){
        this.driver=driver;
    }



    public void scrollDownPage (){
        WebElement tableElem = driver.findElement(table);
        String script = "arguments[0].scrollIntoView()";
        ((JavascriptExecutor) driver).executeScript(script, tableElem);

    }

}
