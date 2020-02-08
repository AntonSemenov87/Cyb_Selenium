package PageObjectModelTests;

import Pages.smartbear_pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Config;
import utilities.Driver;

public class SmartBearLoginTests {

    LoginPage loginPage = new LoginPage ();

    @BeforeMethod
    public void setUp () {
        // 1 - we get the page
        Driver.getDriver().get(Config.getProperty("smartbearUrl"));
    }

    @Test
    public void wrongUsernameTest() {

        // 2- we enter wrong username
        String wrongUsername = Config.getProperty("wrongUsername");
        loginPage.usernameInput.sendKeys(wrongUsername);

        // 3 - we enter correct password
        String correctPassword = Config.getProperty("correctPassword");
        loginPage.passwordInput.sendKeys(correctPassword);

        // 4 - click login button
        loginPage.loginButton.click();

        // 5 - verify error message
        Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is NOT displayed");
    }

    @Test
    public void wrongPasswordTest () {
        // 1 - getting the page in BeforeMethod
        // 2 - enter correct username
        loginPage.usernameInput.sendKeys(Config.getProperty("correctUsername"));

        // 3 - enter wrong password
        loginPage.passwordInput.sendKeys(Config.getProperty("wrongPassword"));

        //4 - click on login button
        loginPage.loginButton.click();

        //5 - assert error message is displayed
        Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is NOT displayed");
    }

    @Test
    public void noUserNameTest () {
        // 1 - getting the page in BeforeMethod
        // 2 - not entering username
        // 3 - enter correct password
        loginPage.passwordInput.sendKeys(Config.getProperty("correctPassword"));
        // 4 - click login button
        loginPage.loginButton.click();
        // 5 - assert error message is displayed
    }

    @Test
    public void noPasswordTest() {
        // 1 - getting page in the BeforeMethod
        // 2 - enter correct username
        loginPage.usernameInput.sendKeys(Config.getProperty("correctUsername"));
        // 3 - we do NOT enter password
        // 4 - click on login button
        loginPage.loginButton.click();
        // 5 - assert error message si displayed
        Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is NOT displayed");
    }


}
