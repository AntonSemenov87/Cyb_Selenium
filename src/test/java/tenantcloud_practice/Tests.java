package tenantcloud_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tenantcloud.com");

        driver.findElement(By.id("signUpInput")).sendKeys("Testtest657@gmail.com");
        driver.findElement(By.id("signUpButton")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[.='Landlord']")).click();
        driver.findElement(By.xpath("//span[.='Tenant']")).click();
        driver.findElement(By.id("password")).sendKeys("Test1234");
        driver.findElement(By.id("password_confirmation")).sendKeys("Test1234");
        driver.findElement(By.xpath("//button[.='Sign up']")).click();


    }
}
