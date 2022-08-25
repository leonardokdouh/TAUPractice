package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTests {

    @Test
    public void selectOptions(){
        var dropDownPage =homePage.clickDropDown();
        dropDownPage.selectFromDropdow("Option 1");

        var selectedOptions = dropDownPage.getSelectedOptions();

        Assert.assertEquals(selectedOptions.size(),
                1, "incorrect amount of elemets");
        Assert.assertTrue(selectedOptions.contains("Option 1"),
                "dont contain the item");

    }

}
