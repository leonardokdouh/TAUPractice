package web;

import org.openqa.selenium.WebDriver;
import services.SessionFactory;

public class Page {

    public void entrar(){

        WebDriver asd = SessionFactory.openSession().getDriver();

        asd.get("asdasd");



    }

}
