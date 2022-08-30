package alerts;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTests extends BaseTests {
    private WebDriver driver;


    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickJsAlerts();
        alertPage.clickAlert();
        alertPage.acceptAlert();
        Assert.assertEquals(alertPage.getTextResult(), "You successfully clicked an alert");

    }

    @Test
    public void testConfirmAlert(){
        var confirmPage = homePage.clickJsAlerts();
        confirmPage.clickConfirm();
        confirmPage.acceptAlert();
        Assert.assertEquals(confirmPage.getConfirmText(), "You clicked: Ok");

    }

    @Test
    public void testPromp() throws InterruptedException {
        var prompPage = homePage.clickJsAlerts();
        Thread.sleep(2000);
        prompPage.clickJsPromp();
        String text= "holis";
        prompPage.typeOnPromp(text);
        prompPage.acceptAlert();
        Thread.sleep(5000);


    }







}
