package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver=driver;
        navigate=driver.navigate();

    }


    public void goBack(){
        navigate.back();
    }

    public void goFoward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }

    public void switchToTab(String tabName){
        var windows =driver.getWindowHandles();
        System.out.println("Number of tabs" + windows.size());

        System.out.println("Window handles:");
        windows.forEach(System.out::println);

        for(String window: windows){
            System.out.println("Switching to window:" + window);
            driver.switchTo().window(window);

            System.out.println("Current Window tittle: " + driver.getTitle());

            if(tabName.equals(driver.getTitle())){
                break;
            }
        }

    }


}
