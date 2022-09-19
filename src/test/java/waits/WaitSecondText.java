package waits;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.pages.HomePage;

public class WaitSecondText extends BaseTests {



    @Test

    public void secondWaitTest(){
        var dynamicPage = homePage.clickDynamicLoading().secondLink();

        dynamicPage.clickStart();

        Assert.assertEquals(dynamicPage.getFinalText(), "Hello World!");

    }



}
