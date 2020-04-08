package seleniumintro.Udemy;

import org.openqa.selenium.By;
import utilities.Driver;

public class HomeWork_iFrames {
    public static void main(String[] args) {
        Driver.getDriver().get("https://the-internet.herokuapp.com/");
        Driver.getDriver().findElement(By.xpath("//a[text()='Nested Frames']")).click();

        Driver.getDriver().switchTo().frame(0);
        System.out.println(Driver.getDriver().findElements(By.tagName("frame")).size());
        Driver.getDriver().switchTo().frame(1);
        System.out.println(Driver.getDriver().findElement(By.id("content")).getText());
        Driver.getDriver().switchTo().defaultContent();
    }
}
