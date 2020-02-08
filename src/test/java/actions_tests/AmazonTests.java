package actions_tests;

import Pages.amazon_pages.AmazonLandingPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class AmazonTests {
    @Test
    public void signInLinkHoverTest () {
        // 1 - get the page
        Driver.getDriver().get("https://www.amazon.com");

        // 2 - create Object of Pages class to reach webElements
        AmazonLandingPage amazonLandingPage = new AmazonLandingPage();

        // 3 - create the Object of Actions class and pass driver instance in the constructor
        Actions actions = new Actions(Driver.getDriver());


        // 4 - we will move to the link using actions instance and methods
        actions.moveToElement(amazonLandingPage.signInLink).perform();


    }
}
