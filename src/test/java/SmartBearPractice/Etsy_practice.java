package SmartBearPractice;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Etsy_practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.get("https://www.etsy.com/");

        WebElement signInButton = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));
        signInButton.click();

        //email login
        WebElement signinEmail = driver.findElement(By.xpath("//input[@id='join_neu_email_field']"));
        signinEmail.sendKeys("Antoxatesting@gmail.com");
        //email password
        WebElement signinPassword = driver.findElement(By.xpath("//input[@id='join_neu_password_field']"));
        signinPassword.sendKeys("Testtest123");
        //Sign in
        WebElement signIn = driver.findElement(By.xpath("//button[@name='submit_attempt']"));
        signIn.click();

        Thread.sleep(3000);

        //Search box
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchBox.sendKeys("apple iPhone 11 pro case");

        Thread.sleep(2000);
        // Search icon
        WebElement searchIcon = driver.findElement(By.xpath("//button[contains(@class,'wt-input-btn-group__btn')]"));
        searchIcon.click();

        WebElement barlowCase = driver.findElement(By.xpath("//li[8]//div[1]//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//img[1]"));
        barlowCase.click();

        WebElement buyItNow = driver.findElement(By.xpath("//form[contains(@class,'add-to-cart-form')]//button[contains(@class,'mt-xs-2')]"));
        buyItNow.click();

        driver.quit();

    }
}
