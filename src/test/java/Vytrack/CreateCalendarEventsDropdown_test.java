package Vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.VytrackUtils;

public class CreateCalendarEventsDropdown_test {
    public static void main(String[] args) {
        WebDriver driver;

        String createCalendarButton = "a[title = 'Create Calendar event']";
        String saveAndCloseButtonLocatorXpath = "//div/button[contains(text), 'Save and Close']";
        String dropdownButtonLocatorXpath = "//a[@class = 'btn-success btn dropdown-toggle']";
        //                                  //  a/span[@class = 'caret']
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
        VytrackUtils.login(driver, "storemanager85", "UserUser123");

        VytrackUtils.navigateToModule(driver, "Activities", "Calendar Events");

        driver.findElement(By.cssSelector(createCalendarButton)).click();


    }
}
