package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class Homework_ImplicitExplicitWaits {
    public static void main(String[] args) {
        Driver.getDriver().get("http://www.itgeared.com/demo/1506-ajax-loading.html");
        Driver.getDriver().findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 7);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
        System.out.println(Driver.getDriver().findElement(By.xpath("//div[@id='results']")).getText());
    }
}
