package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import services.pages.HomePage;
import utils.WindowManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       goHome();
    }

    @BeforeMethod
    public void goHome(){

        driver.get("http://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    //@AfterClass
    public void tearDown(){
        driver.quit();
    }


    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    //  public void shiftingContent(){
//        driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/");
//        WebElement shiftingLink = driver.findElement(new By.ByLinkText("Shifting Content"));
//        shiftingLink.click();
//
//        WebElement menuElementLink = driver.findElement(new By.ByLinkText("Example 1: Menu Element"));
//        menuElementLink.click();
//        List<WebElement> optionsList = driver.findElements(By.tagName("li"));
//        System.out.println(optionsList.size());
//        driver.close();
//
//    }

}
