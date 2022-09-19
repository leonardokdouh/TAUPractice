package waits;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.pages.HoverPage;

public class WaitFirstTest extends BaseTests {

    @Test
    public void firstDynamicTest() {
        var firstDynam = homePage.clickDynamicLoading().firstLink();
        firstDynam.clickButton();

        Assert.assertEquals(firstDynam.returnLoadingText(), "Hello World!");



    }
}
