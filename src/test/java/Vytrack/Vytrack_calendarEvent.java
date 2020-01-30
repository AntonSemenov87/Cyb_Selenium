package Vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.VytrackUtils;

public class Vytrack_calendarEvent {
    public static void main(String[] args) {
        WebDriver driver;

        String calendarButton = "a[title = 'Create Calendar event']";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");

        VytrackUtils.login(driver, "storemanager85", "UserUser123");

        VytrackUtils.navigateToModule(driver, "Activities", "Calendar Events");


        if (driver.findElement(By.cssSelector(calendarButton)).isDisplayed()) {
            System.out.println("Calendar Events button is displayed - PASS");
        } else {
            System.out.println("Calendar Events button is NOT displayed - Failed");
        }

driver.quit();
    }
}
