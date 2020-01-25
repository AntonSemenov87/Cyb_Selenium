package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Cybertek_AddRemoveElements {
    public static void main(String[] args) throws InterruptedException {
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go tohttp://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        // 3.Click to “Add Element”button
        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        Thread.sleep(2000);
        addElementButton.click();

        //4.Verify “Delete”button is displayed after clicking.

        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("Delet button is displayed - PASSED");
        } else {
            System.out.println("Delete button is NOT displayed - FAILED");
        }
        Thread.sleep(2000);


        // 5.Click to “Delete”button.
        deleteButton.click();

        // 6.Verify “Delete”button is NOT displayed after clicking.
        try {
            driver.findElement(By.xpath("//button[.='Add Element']"));
            if (!deleteButton.isDisplayed()) {
                System.out.println("Delete button is NOT displayed - PASSED");
            } else {
                System.out.println("Delete button IS displayed - FAILED!");
            }
        } catch (NoSuchElementException a) {
            System.out.println("Delete button is displayed, verification PASSED!");
        }

        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS


    }
}
