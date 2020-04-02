package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

       // driver.findElement(By.name("btnK")).click();
        String expectedInTitle = "apple";
        String actualInTitle = driver.getTitle();
        System.out.println(actualInTitle);

        if (actualInTitle.startsWith(expectedInTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
