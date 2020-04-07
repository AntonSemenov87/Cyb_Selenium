package seleniumintro.Udemy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.Driver;

public class Alerts_practice {
    public static void main(String[] args) {
        Driver.getDriver().get("http://www.rahulshettyacademy.com/AutomationPractice/");

        // Alert - OK
        Driver.getDriver().findElement(By.id("name")).sendKeys("Anton");
        Driver.getDriver().findElement(By.cssSelector("#alertbtn")).click();
        Driver.getDriver().switchTo().alert().accept();

        // Alert - Cancel and OK
        Driver.getDriver().findElement(By.id("name")).sendKeys("Anton");
        Driver.getDriver().findElement(By.id("confirmbtn")).click();
        Driver.getDriver().switchTo().alert().dismiss();

        // Alert - getting text from message
        Driver.getDriver().findElement(By.id("name")).sendKeys("Anton");
        Driver.getDriver().findElement(By.id("confirmbtn")).click();
        String text = Driver.getDriver().switchTo().alert().getText();
        System.out.println(text);
        Driver.getDriver().switchTo().alert().dismiss();



    }
}
