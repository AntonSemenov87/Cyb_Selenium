package seleniumintro.Udemy;

import org.openqa.selenium.By;
import utilities.Driver;

public class Udemy_facebook_xpath {
    public static void main(String[] args) {
        Driver.getDriver().get("https://www.facebook.com");
        /* XPATH below
        Driver.getDriver().findElement(By.xpath("//*[@type='email']")).sendKeys("test@gmail.com");
        Driver.getDriver().findElement(By.xpath("//*[@id='pass']")).sendKeys("Test123");
        Driver.getDriver().findElement(By.xpath("//*[@value='Log In']")).click();
         */
        // CSS below
        Driver.getDriver().findElement(By.cssSelector("#email")).sendKeys("test123@gmail.com");
        Driver.getDriver().findElement(By.cssSelector("#pass")).sendKeys("Test123");
        Driver.getDriver().findElement(By.cssSelector("input[value='Log In']")).click();
    }
}
