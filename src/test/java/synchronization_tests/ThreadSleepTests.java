package synchronization_tests;

import Pages.practice_cybertek_pages.DynamicLoading2Page;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class ThreadSleepTests {
    @Test
    public void threadSleepTest () {
        // 1 - getting the page
        Driver.getDriver().get("http://practice.cybertekschool.co,/dynamic_loading/2");

        // 2 - Creating Object to be able to reach Page class' webElements
        DynamicLoading2Page dynamicLoading2Page = new DynamicLoading2Page();

        // 3 - clicking on the Start button using the Object we created
        dynamicLoading2Page.startButton.click();

        // 4 - Assert the webElement is displayed on the page
        Assert.assertTrue(dynamicLoading2Page.helloWorldText.isDisplayed(), "text is NOT displayed on the page");

        // 5 -
    }
}
