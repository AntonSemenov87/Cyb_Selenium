package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.Driver;

public class Homework_1 {
    public static void main(String[] args) throws InterruptedException {
        /*HW1
        Driver.getDriver().get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement option1 = Driver.getDriver().findElement(By.id("checkBoxOption1"));
        option1.click();
        Assert.assertTrue(option1.isSelected());
        option1.click();
        Assert.assertFalse(option1.isSelected());

        int size = Driver.getDriver().findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println(size);

        */


        // HW2
        Driver.getDriver().get("https://www.cleartrip.com");
        Thread.sleep(5000);
        Driver.getDriver().findElement(By.id("DepartDate]")).click();
        Driver.getDriver().findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
        Select adults = new Select(Driver.getDriver().findElement(By.id("Adults")));
        adults.selectByValue("5");
        Select kids = new Select(Driver.getDriver().findElement(By.id("Childrens")));
        kids.selectByValue("2");
        Driver.getDriver().findElement(By.id("MoreOptionsLink")).click();
        Driver.getDriver().findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
        Driver.getDriver().findElement(By.id("SearchBtn")).click();
        System.out.println(Driver.getDriver().findElement(By.id("homeErrorMessage")).getText());


    }
}
