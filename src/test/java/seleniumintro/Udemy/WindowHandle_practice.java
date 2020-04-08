package seleniumintro.Udemy;

import org.openqa.selenium.By;
import utilities.Driver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle_practice {
    public static void main(String[] args) {
        Driver.getDriver().get("https://accounts.google.com/signup");
        System.out.println("Before switching: " + Driver.getDriver().getTitle()); // current Parent window/tab
        Driver.getDriver().findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=en']")).click();


        // Operations for witching to child window/tab
        Set<String> ids = Driver.getDriver().getWindowHandles();
        Iterator<String> iterator = ids.iterator();
        String parentID = iterator.next();
        String childID = iterator.next();
        Driver.getDriver().switchTo().window(childID);
        System.out.println("After switching: " + Driver.getDriver().getTitle());

        // Switching back to Parent window/tab
        Driver.getDriver().switchTo().window(parentID);
        System.out.println("Switching back to parent tab: " + Driver.getDriver().getTitle());



        Driver.quitDriver();
    }
}
