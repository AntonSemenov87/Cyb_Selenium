package Mentoring_Tue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_mentoring {

    WebDriver driver;


    @Before
    public void SetUp () {
        System.out.println("Instantiating the driver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        System.out.println("Quitting the browser");
        driver.quit();
    }

    @Test
    public void navigateTo() {
        String url = "https://www.amazon.com";
        driver.get(url);
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        Assert.assertEquals(url, actualURL);


    }

}
