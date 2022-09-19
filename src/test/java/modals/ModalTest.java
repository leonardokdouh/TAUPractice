package modals;

import base.BaseTests;
import org.testng.annotations.Test;

public class ModalTest extends BaseTests{

    @Test
    public void modalTest(){
        var entrypage = homePage.clickEntryAdPage();
        entrypage.closeModal();





    }




}
