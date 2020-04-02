package actions_tests;

import Pages.practice_cybertek_pages.HoversPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class HoversTests {

    @Test
    public void hoversTests () throws InterruptedException {
        // 1 - get the page
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        // 2 - create Object of the Hovers page class to reach webElements in that class
        HoversPage hoversPage = new HoversPage();

        // 3 - create Object of the Actions class, and pass the driver
        Actions actions = new Actions(Driver.getDriver());

        // 4 - Using actions instance we move to webElements that are previously located in HoversPage class
        actions.moveToElement(hoversPage.image1).perform();

        // 5 - assert the expected text is displayed on the page
        Assert.assertTrue(hoversPage.user1Text.isDisplayed());

        Thread.sleep(2000);

        // 6 - move to second image
        actions.moveToElement(hoversPage.image2).perform();
        // 7 - assert user2Text is displayed
        Assert.assertTrue(hoversPage.user2Text.isDisplayed());

        Thread.sleep(2000);

        // 8 - move to third image
        actions.moveToElement(hoversPage.image3).perform();
        // 9 - assert user3Text is displayed
        Assert.assertTrue(hoversPage.user3Text.isDisplayed());

        Driver.quitDriver();

    }


}
