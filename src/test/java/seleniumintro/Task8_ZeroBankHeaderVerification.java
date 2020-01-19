package seleniumintro;
/*
Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Get attribute value of href from the “forgot your password” link
4.Verify attribute value containsExpected: “/forgot-password.html”
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8_ZeroBankHeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        String actualAttribute = driver.findElement(By.linkText("Forgot your password ?")).getAttribute("href");
        String expectedAttribute = "/forgot-password.html";

        if (actualAttribute.contains(expectedAttribute)) {
            System.out.println("Attribute check Passed");
        } else {
            System.out.println("Attribute check FAILED");
        }

       driver.close();

        }
}
