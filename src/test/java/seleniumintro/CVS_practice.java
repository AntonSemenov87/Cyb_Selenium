package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CVS_practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.cvs.com");
        driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys("shampoo"+ Keys.ENTER);
       // driver.findElement(By.xpath("//*[@id='flex-button-search']/button/svg[1]")).click();
    }
}
