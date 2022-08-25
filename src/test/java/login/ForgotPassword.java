package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.pages.ForgotRetrievePage;

public class ForgotPassword extends BaseTests {

@Test
    public void ForgotPasswordTest(){
    var forgotPage = homePage.clickForgot();
    forgotPage.enterEmail("asdads@gmail.com");
    ForgotRetrievePage retrievePage = forgotPage.clickButtom();
    Assert.assertTrue(retrievePage.getText().
            contains("Internal Server Error"), "Not containing");
}

}
