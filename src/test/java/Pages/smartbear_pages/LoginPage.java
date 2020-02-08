package Pages.smartbear_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    // when we're creating a Page Object Model page
    //1 - create Constructor and call Page Factory method
    public LoginPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //2 - use @FindBy annotation to locate webElements
    // Then we store that webElement on the next line
    @FindBy (id = "ctl00_MainContent_username")
    public WebElement usernameInput;

    @FindBy (id = "ctl00_MainContent_password")
    public WebElement passwordInput;

    @FindBy (id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy (id = "ctl00_MainContent_status")
    public WebElement errorMessage;
}
