/*
TC#1 Search Amazon
1. Open browser
2. Go to https://amazon.com
3. Enter any search term
4. Click search button
5. Verify title contains the search term
USE CSS SELECTOR TO LOCATE WEBELEMENTS
 */
package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_CSS_locator {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        WebElement amazonSearchBox = driver.findElement(By.cssSelector("input[type='text']"));
        amazonSearchBox.sendKeys("apple");
        WebElement amazonSearchIcon = driver.findElement(By.cssSelector("input[tabindex='20']"));
        amazonSearchIcon.click();
        String expectedInTitle = "apple";
        String actualInTitle = driver.getTitle();

        if (actualInTitle.contains(expectedInTitle)) {
            System.out.println("Title verification Passed");
        } else {
            System.out.println("Title verification Failed!");
        }

        driver.quit();

    }
}
