package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().firstLink();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goFoward();
        getWindowManager().goTo("http://google.com");

    }

        @Test
    public void testSwitchs(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");


    }

    @Test
    public void testSwitchToDinamycExample2(){
       homePage.clickDynamicLoading().comandAndClick();


    }


}
