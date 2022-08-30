package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver= driver;
    }

    public LoginPage clickAuthen(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public ForgotPasswordPage clickForgot(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoverPage clickHover(){
        clickLink("Hovers");
        return new HoverPage(driver);

    }

    private void clickLink(String text){
        driver.findElement(By.linkText(text)).click();
    }

    public void clickWithXpath(String text){
        driver.findElement(new By.ByXPath(text)).click();
    }

    public KeyPress clickKeyPressLink(){
       clickWithXpath("//a[@href='/key_presses']");
        return new KeyPress(driver);

    }

    public SliderPage clickSlider(){
        clickWithXpath("//a[@href='/horizontal_slider']");
        return new SliderPage(driver);
    }

    public JsAlerts clickJsAlerts(){
        clickWithXpath("//a[@href=\"/javascript_alerts\"]");
        return new JsAlerts(driver);
    }

    public ContextMenuPage clickContextMenu(){
        driver.findElement(By.cssSelector("a[href=\"/context_menu\"]")).click();
        return new ContextMenuPage(driver);
    }

    public WYSPage clickWys(){
        driver.findElement(By.cssSelector("a[href=\"/tinymce\"]")).click();
        return new WYSPage(driver);
    }


}
