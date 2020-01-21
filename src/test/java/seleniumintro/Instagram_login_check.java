package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_login_check {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("mr_antonsemenov");
        driver.findElement(By.name("password")).sendKeys("password"+ Keys.ENTER);


        Thread.sleep(5000);

        driver.close();
    }
}
