package seleniumintro.Udemy;

import org.openqa.selenium.By;
import utilities.Driver;

public class Udemy_rediff_practice {
    public static void main(String[] args) {
            Driver.getDriver().get("http://www.rediff.com");
            Driver.getDriver().findElement(By.cssSelector("a[title*='Sign in']")).click();
            Driver.getDriver().findElement(By.xpath("//input[@id='login1']")).sendKeys("Tester123");
            Driver.getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys("Test123123");
            Driver.getDriver().findElement(By.xpath("//input[contains(@class,'signinbtn')]")).click();

            Driver.getDriver().get("https://rahulshettyacademy.com/seleniumPractise/#/");
           // Driver.getDriver().findElement(By.linkText("Brocolli - 1 Kg"));
            Driver.getDriver().findElement(By.xpath("(//input[@class='quantity'])[1]")).sendKeys("10");
            Driver.getDriver().findElement(By.xpath("(//div[@class='product-action']//button)[1]")).click();
        }
}
