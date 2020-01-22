/*
1. Open browser
2. Go to https://etsy.com
3. Enter any search term
4. Click search button
5. Verify title contains the search term
USE XPATH TO LOCATE WEBELEMENTS

 */
package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy_XPATH {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");



        WebElement etsySearchBox = driver.findElement(By.xpath("//input[@name='search_query']"));
        etsySearchBox.sendKeys("wooden spoon");

        WebElement etsySearchButton = driver.findElement(By.xpath("html/body/div[5]/header/div[2]/div/form/div/div/button"));
        etsySearchButton.click();

        String actualTitle = driver.getTitle();
        actualTitle = actualTitle.toUpperCase();
        System.out.println(actualTitle);
        String expectedInTitle = "WOODEN SPOON";

        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("Title verification Passed");
        } else {
            System.out.println("Title verification FAILED");
        }
        driver.navigate().back();
        driver.navigate().refresh();


        driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Apple iPhone 11 pro case");
        driver.findElement(By.xpath("html/body/div[5]/header/div[2]/div/form/div/div/button")).click();

        String actualTitle1 = driver.getTitle();
        String expectedInTitle1 = "Apple iphone 11 pro case";

        if (actualTitle1.contains(expectedInTitle1)) {
            System.out.println("Apple Title verification Passed");
        } else {
            System.out.println("Apple Title verification FAILED");
        }



        driver.quit();
    }

    public static void searchBox (String s) {

    }
}
