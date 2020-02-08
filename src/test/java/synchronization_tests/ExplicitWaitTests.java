package synchronization_tests;

import Pages.practice_cybertek_pages.DynamicLoading1Page;
import org.testng.annotations.Test;
import utilities.Driver;

public class ExplicitWaitTests {

    @Test
    public void waitForInputBoxTest () {
        // 1 - get the page
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");

        // 2 - create Object to use webElements
        DynamicLoading1Page dynamicLoading1Page = new DynamicLoading1Page();

        // 3 - click on Start button
        dynamicLoading1Page.startButton.click();

        // 4 - we try to send keys
        dynamicLoading1Page.usernameInput.sendKeys("tomsmith");
        dynamicLoading1Page.passwordInput.sendKeys("");
    }

}
