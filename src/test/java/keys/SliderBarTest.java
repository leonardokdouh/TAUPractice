package keys;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderBarTest extends BaseTests {


    @Test
    public void horizontalSliderTest(){
        var slider = homePage.clickSlider();
        slider.clickBar();
        slider.moveBar(3);
        Assert.assertEquals(slider.getRangeText(), "4");





    }

}
