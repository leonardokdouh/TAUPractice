package services.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    private By dropMenu= new By.ByXPath("//select[@id='dropdown']");


    public DropDownPage(WebDriver driver){
        this.driver=driver;
    }

    public void selectFromDropdow (String option){
        findDropdown().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions(){
       List<WebElement> listElements= findDropdown().getAllSelectedOptions();
       return listElements.stream().map(e->e.getText()).
               collect(Collectors.toList());
    }


    private Select findDropdown(){
        return new Select(driver.findElement(dropMenu));

    }

}
