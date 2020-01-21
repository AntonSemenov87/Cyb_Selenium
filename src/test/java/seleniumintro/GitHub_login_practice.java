package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub_login_practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://github.com/login");

        driver.findElement(By.id("login_field")).sendKeys("Anthony04061987@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Anthony5025");
        driver.findElement(By.name("commit")).click();
        WebElement searchRepo = driver.findElement(By.className("dashboard-repos-filter-left"));
        Thread.sleep(2000);
                searchRepo.sendKeys("AntonSemenov87/CybertekPractice"+ Keys.ENTER);
        String expectedRepoName = "CybertekPractice";
        String actualRepoName = driver.findElement(By.linkText("CybertekPractice")).getText();

        if (actualRepoName.equals(expectedRepoName)) {
            System.out.println("Repo check verification PASSED");
        } else {
            System.out.println("Repo check verification FAILED!");
        }

        driver.close();
    }
}
