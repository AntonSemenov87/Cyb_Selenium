package SmartBearPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Techlistic_practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.get("https://www.techlistic.com/");

        // validating title
        String expectedTitle = "Techlistic";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED!");
        }

        // validating url
        String expectedURL = "https://www.techlistic.com";
        String actualURL = driver.getCurrentUrl();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("URL verification PASSED!");
        } else {
            System.out.println("URL verification FAILED!!!");
        }

        // SeleniumTutorial link
        driver.findElement(By.xpath("//div[@id='LinkList2']//a[contains(text(),'Selenium Tutorial')]")).click();

        //Verify Selenium Tutorial title
        String expTitle = "Selenium Tutorial - Learn Selenium from Comprehensive Series of 40 Coding Tutorials";
        String actTitle = driver.getTitle();
        if (expTitle.equals(actTitle)) {
            System.out.println("Selenium Tutorial title verification PASSED");
        } else {
            System.out.println("Selenium Tutorial title verification FAILED");
        }

        // navigating back
        driver.navigate().back();

        driver.findElement(By.xpath("//a[contains(text(),'TestNG Tutorial')]")).click();
        String exTitle = "Selenium with TestNG Integration - Tutorial Series";
        String acTitle = driver.getTitle();

        if (exTitle.equals(acTitle)) {
            System.out.println("TestNG title verification PASSED");
        } else {
            System.out.println("TestNG title verification FAILED!");
        }




        driver.quit();


    }
}
