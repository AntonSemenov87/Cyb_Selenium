package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_BasicLoginAuthentication {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification Passed");
        } else {
            System.out.println("Title verification Failed!");
        }

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));

        username.sendKeys("Tester");
        password.sendKeys("test");

        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String expectedTitle1 = "Web Orders";
        String actualTitle1 = driver.getTitle();

        if (actualTitle1.equals(expectedTitle1)) {
            System.out.println("Web Order title verification passed");
        } else {
            System.out.println("Web Order title verification Failed!");

        }



        driver.close();
    }
}
