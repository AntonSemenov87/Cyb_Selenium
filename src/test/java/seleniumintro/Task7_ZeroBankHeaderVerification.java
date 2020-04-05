package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7_ZeroBankHeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        System.out.println(driver.findElement(By.className("page-header")).getText());

        String str = driver.findElement(By.className("page-header")).getText();
        String expectedHeader = "Log in to ZeroBank";

        if (str.equals(expectedHeader)) {
            System.out.println("Check Passed");
        } else {
            System.out.println("Check failed");
        }
        driver.close();





    }
}
