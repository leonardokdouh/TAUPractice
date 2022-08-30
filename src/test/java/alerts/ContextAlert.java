package alerts;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextAlert extends BaseTests {
    private WebDriver driver;



    @Test

    public void contextClickTest() throws InterruptedException {
        var contextPage = homePage.clickContextMenu();
        contextPage.contextRightClick();
        Assert.assertEquals(contextPage.acceptAlert(), "You selected a context menu");
    }

}
