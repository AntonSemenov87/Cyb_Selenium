package Pages.practice_cybertek_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DynamicLoading1Page {
    public DynamicLoading1Page () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy (id="username")
    public WebElement usernameInput;

    @FindBy (id="password")
    public WebElement passwordInput;
}
