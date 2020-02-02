package Cybertek_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowHandle_testNG {
    WebDriver driver;

    @BeforeClass
    public void setUp (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://practice.cybertekschool.com/windows");
    }

    @Test
    public void windowHandleTest () {
        String expectedTitle = "Practice";
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

        String mainHandle = driver.getWindowHandle();
        driver.getWindowHandles();

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainHandle)) {
                driver.switchTo().window(handle);
                System.out.println(driver.getTitle());
            }
        }
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "New Window");

    }

}
