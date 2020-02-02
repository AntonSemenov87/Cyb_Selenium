package testNG;

import SmartBearPractice.Smartbear_link_verif;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBear_deleteAll {
    WebDriver driver;

    @BeforeMethod
    public void setUp () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Test
    public void deleteAllTest () {
        Smartbear_link_verif.loginToSmartBear(driver);
        String checkAllLocatorID = "ctl00_MainContent_btnCheckAll";
        driver.findElement(By.id(checkAllLocatorID)).click();

        List <WebElement> checkboxes = driver.findElements(By.xpath("//table[@id=‘ctl00_MainContent_orderGrid’]/tbody/tr/td[1]"));

        for (WebElement checkbox : checkboxes) {
            Assert.assertTrue(checkbox.isSelected());
        }

        String deleteAllLocatorID = "ctl00_MainContent_btnDelete";
        driver.findElement(By.id(deleteAllLocatorID)).click();

        WebElement emptyOrderListMessage = driver.findElement(By.id("ctl00_MainContent_orderMessage"));
        Assert.assertTrue(emptyOrderListMessage.isDisplayed(), "Empty order list message is NOT displayed");
    }





}
