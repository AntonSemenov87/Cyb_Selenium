package SmartBearPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartBear_login {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedInTitle = "Web Orders Login";
        String actualInTitle = driver.getTitle();

        if (expectedInTitle.equals(actualInTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }

        // username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //login
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();


        String expectedTitle = "Web Orders";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }




    }
}
