package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_search {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("MacBookPro 13 inch"+ Keys.ENTER);
        String expectedTitle = "MACBOOK PRO 13 INCH";
        String actualTitle = driver.getTitle().toUpperCase();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title Passed");
        } else {
            System.out.println("Title Failed");
        }
        System.out.println(actualTitle);

        driver.quit();
    }
}
