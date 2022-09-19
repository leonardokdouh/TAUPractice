package scrolls;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LargeAndDeepTest extends BaseTests {

    @Test
    public void scrollTest(){
       homePage.clickLargeAndDeepPage().scrollDownPage();
    }

    @Test
    public void testScrollToForthParagraph(){
        homePage.clickInfinitePage().scrollToParagraph(4);
    }

}
