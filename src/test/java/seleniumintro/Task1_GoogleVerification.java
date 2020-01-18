package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_GoogleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); // sets up the driver for us

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Google title verification PASSED");
        } else {
            System.out.println("Google title verification FAILED!!!");
        }

        driver.close();
    }
}
