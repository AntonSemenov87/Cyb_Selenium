package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_BackAndForthNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Gmail")).click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Gmail title verification PASSED");
        } else {
            System.out.println("Gmail title verification FAILED");
        }

        driver.navigate().back();

        String expectedTitleGoogle = "Google";
        String actualTitleGoogle = driver.getTitle();

        if (actualTitleGoogle.equals(expectedTitleGoogle)) {
            System.out.println("Google title verification PASSED");
        } else {
            System.out.println("Google title verification FAILED");
        }

        driver.navigate().forward();
        String expectedTitle2 = "Gmail";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.contains(expectedTitle2)) {
            System.out.println("Gmail title verification PASSED");
        } else {
            System.out.println("Gmail title verification FAILED");
        }

        driver.close();
    }

}
