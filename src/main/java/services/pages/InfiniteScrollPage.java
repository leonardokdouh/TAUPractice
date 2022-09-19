package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By infiniteText = By.className("jscroll-added");


    public InfiniteScrollPage(WebDriver driver){
        this.driver=driver;
    }

    /**
     *Method will scroll until reachs the index is reached
     */
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;
        while(getNumberOfParagraphs()<index){
            jsExecutor.executeScript(script);
        }
    }

    private int getNumberOfParagraphs(){
        return driver.findElements(infiniteText).size();
    }

}
