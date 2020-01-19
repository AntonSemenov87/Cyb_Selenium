package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5_GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");


        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);
        // OR:
       // WebElement searchbox = driver.findElement(By.name("q"));
       // searchbox.sendKeys("apple");

        driver.findElement(By.name("btnK"));

        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)) {
            System.out.println("Apple Title verification passed");
        } else {
            System.out.println("Apple Title verification Failed");
        }

        driver.close();



    }
}
