package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Udemy_Selenium_practice1 {
    public static void main(String[] args) throws InterruptedException {
       // Driver.getDriver().get("https://www.google.com");
//        System.out.println(Driver.getDriver().getTitle());
//        System.out.println(Driver.getDriver().getCurrentUrl());
        //System.out.println(Driver.getDriver().getPageSource());
        //System.out.println(Driver.getDriver().manage().getCookies());
        Driver.getDriver().navigate().to("https://www.facebook.com");
        Driver.getDriver().findElement(By.id("email")).sendKeys("Anthony04061987@gmail.com");
        Driver.getDriver().findElement(By.id("pass")).sendKeys("TestInvalidPassword");
        Driver.getDriver().findElement(By.xpath("//input[@value='Log In']")).click();
        String actualName = Driver.getDriver().findElement(By.xpath("//div[@class='linkWrap noCount']")).getText();
        String expectedName = "Anton Semenov";

        if (actualName.equals(expectedName)) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }
        System.out.println(actualName);

        Thread.sleep(5000);

      Driver.getDriver().findElement(By.xpath("(//div[@class='linkWrap noCount'])[3]")).click();
      Driver.getDriver().findElement(By.xpath("//span[.='Vita Bezruchko']")).click();
      Driver.getDriver().findElement(By.xpath("//div[@class='_1mf _1mj']")).sendKeys("Johny wants to tell you something using a Java program" + Keys.ENTER);
      Driver.getDriver().findElement(By.xpath("//div[@class='_1mf _1mj']")).sendKeys("Hey mom, this is how many times I miss you" + Keys.ENTER);

      Driver.getDriver().findElement(By.xpath("//div[@class='_1mf _1mj']")).sendKeys(" 'miss you number' " + Keys.ENTER);




        Driver.quitDriver();
    }
}
