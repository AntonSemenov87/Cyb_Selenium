package Vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.SeleniumUtils;
import utilities.VytrackUtils;

public class Vytrack_defaultValuesCheck {
    public static void main(String[] args) {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");

        // logging in
        VytrackUtils.login(driver, "storemanager85", "UserUser123");

        // selecting tab and module
        VytrackUtils.navigateToModule(driver, "Activities", "Calendar Events");

        //clicking on Create new event button
        driver.findElement(By.xpath("//a[@title='Create Calendar event']")).click();

        //checking for correct URL
        String expectedURL = "https://qa2.vytrack.com/calendar/event/create";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);




    }
}
