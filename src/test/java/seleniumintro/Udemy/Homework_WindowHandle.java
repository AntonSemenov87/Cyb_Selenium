package seleniumintro.Udemy;

import org.openqa.selenium.By;
import utilities.Driver;

import java.util.Iterator;
import java.util.Set;

public class Homework_WindowHandle {
    public static void main(String[] args) {
        Driver.getDriver().get("https://the-internet.herokuapp.com/");
        Driver.getDriver().findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        Driver.getDriver().findElement(By.xpath("//a[text()='Click Here']")).click();

        Set<String> ids =  Driver.getDriver().getWindowHandles();
        Iterator<String> iterator = ids.iterator();
        String parentID = iterator.next();
        String childId = iterator.next();

        Driver.getDriver().switchTo().window(childId);
        System.out.println(Driver.getDriver().findElement(By.xpath("//div[@class='example']/h3")).getText());

        Driver.getDriver().switchTo().window(parentID);
        System.out.println(Driver.getDriver().findElement(By.xpath("//div[@class='example']/h3")).getText());


    }
}
