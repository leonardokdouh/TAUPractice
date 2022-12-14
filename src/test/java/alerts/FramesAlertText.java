package alerts;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesAlertText extends BaseTests {
    private WebDriver driver;

    @Test
    public void textTest(){
        var textpage = homePage.clickWys();
        textpage.clearText();
        textpage.sendText("hello ");
        textpage.clickButton();
        textpage.sendText("world");
        Assert.assertEquals(textpage.getTextFromFrame(), "hello world");
    }

}
