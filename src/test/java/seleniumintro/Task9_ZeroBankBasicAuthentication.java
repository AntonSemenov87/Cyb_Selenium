package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9_ZeroBankBasicAuthentication {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3. Enter username: username
        driver.findElement(By.id("user_login")).sendKeys("username");

        // 4. Enter password: password
        driver.findElement(By.id("user_password")).sendKeys("password");

        // 5. Click sign in button
        driver.findElement(By.name("submit")).click();

        // 6. Verify username is displayed on the page
        if (driver.findElement(By.linkText("username")).isDisplayed()) {
            System.out.println("username verification is PASSED\nUsername is displayed on page");
        } else {
            System.out.println("username verification FAILED");
        }

        // 7. Verify the title Zero – Account Summary
        String actualTitle = driver.getTitle();
        String  expectedTitle = "Zero - Account Summary";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }

        // 8. Verify the link Account Summary’s href value contains: “account-summary”
        String actualAttribute = driver.findElement(By.linkText("Account Summary")).getAttribute("href");
        String expectedAttribute = "account-summary";

        if (actualAttribute.contains(expectedAttribute)) {
            System.out.println("Attribute verification PASSED");
        } else {
            System.out.println("Attribute verification FAILED!");
        }




        driver.close();
    }
}
