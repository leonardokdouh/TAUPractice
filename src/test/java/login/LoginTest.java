package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.pages.LoginPage;
import services.pages.SecureAreaPage;

public class LoginTest extends BaseTests {

   @Test
    public void testSuccessfullLogin(){
    LoginPage loginPage= homePage.clickAuthen();
    loginPage.setUser("tomsmith");
    loginPage.setPass("SuperSecretPassword!");
    SecureAreaPage securePage =loginPage.clickLoginButton();
    Assert.assertTrue(securePage.getAlert().
                    contains("You logged into a secure area!"),
            "test fail bro");
//You can do it with equal or with assert True and using contains()
//    Assert.assertEquals(securePage.getAlert(),
//            "You logged into a secure area!\n" +
//                    "×",
//            "The test fail bro");

    }
}
