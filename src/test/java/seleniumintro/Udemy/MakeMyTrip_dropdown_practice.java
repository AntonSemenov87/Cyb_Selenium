package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.security.Key;

public class MakeMyTrip_dropdown_practice {
    public static void main(String[] args) throws InterruptedException {
        Driver.getDriver().get("http://www.makemytrip.com");

        Thread.sleep(2000);
        WebElement fromCity = Driver.getDriver().findElement(By.cssSelector("#fromCity"));
        fromCity.click();

        Thread.sleep(2000);
        WebElement fromField = Driver.getDriver().findElement(By.xpath("//input[@placeholder='From']"));
        fromField.sendKeys("MUM" + Keys.ARROW_DOWN + Keys.ENTER);
    }
}
