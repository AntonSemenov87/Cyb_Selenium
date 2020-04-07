package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.Driver;

public class Homework {
    public static void main(String[] args) {
        Driver.getDriver().get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement option1 = Driver.getDriver().findElement(By.id("checkBoxOption1"));
        option1.click();
        Assert.assertTrue(option1.isSelected());
        option1.click();
        Assert.assertFalse(option1.isSelected());

        int size = Driver.getDriver().findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println(size);

    }
}
