package PageObjectModelTests;

import Pages.vytrack_pages.VytrackLoginPage;
import org.testng.annotations.Test;
import utilities.Config;

public class LoginTests {

    @Test
    public void positiveLoginScenario () {
        String username = Config.getProperty("storemanagerUsername");
        String password = Config.getProperty("UserUser123");

        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        vytrackLoginPage.usernameInput.sendKeys("storemanager85");
        vytrackLoginPage.passwordInput.sendKeys("UserUser123");
        vytrackLoginPage.loginButton.click();
    }
}
