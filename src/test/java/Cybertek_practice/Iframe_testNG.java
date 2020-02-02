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

public class Iframe_testNG {
    WebDriver driver;

    @BeforeClass
    public void setUp (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://practice.cybertekschool.com/iframe");
    }

    @Test
    public void iFrameCheck () {
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        // OR driver.switchTo.frame("mce_0_ifr")
        driver.switchTo().frame(iframe);
        Assert.assertTrue(iframe.isDisplayed());
        driver.switchTo().defaultContent();
        String actualName = driver.findElement(By.xpath("//h3[contains(text(),'An iFrame containing the TinyMCE WYSIWYG Editor')]")).getText();
        String expectedName = "An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertEquals(actualName, expectedName);
    }
}
