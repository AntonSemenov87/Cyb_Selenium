package Cybertek_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alerts_testNG {
    WebDriver driver;

    @BeforeClass
    public void setUp (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test (priority = 1)
    public void jsAlert ()  {
        WebElement clickForJSAlertButton = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
        clickForJSAlertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        String expectedMSG = "You successfuly clicked an alert";
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, expectedMSG);
    }

    @Test (priority = 2)
    public void jsConfirm () {
        driver.navigate().to("http://practice.cybertekschool.com/javascript_alerts");
        WebElement clickForJSConfirmButton = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
        clickForJSConfirmButton.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        String expectedMSG = "You clicked: Cancel";
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, expectedMSG);
    }

    @Test (priority = 3)
    public void jsPrompt () throws InterruptedException {
        driver.navigate().to("http://practice.cybertekschool.com/javascript_alerts");

        WebElement clickForJSPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
        clickForJSPrompt.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        alert.sendKeys("Hello");
        Thread.sleep(1000);
        alert.accept();


        String expectedMSG = "You entered: Hello";
        String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result, expectedMSG);

    }


}
