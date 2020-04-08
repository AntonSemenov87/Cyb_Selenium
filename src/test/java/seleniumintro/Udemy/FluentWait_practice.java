package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import utilities.Driver;

import java.time.Duration;
import java.util.function.Function;

public class FluentWait_practice {
    public static void main(String[] args) {
        Driver.getDriver().get("http://the-internet.herokuapp.com");
        Driver.getDriver().findElement(By.xpath("//a[text()='Dynamic Loading']")).click();
        Driver.getDriver().findElement(By.xpath("//a[contains(text(),'is hidden')]")).click();
        Driver.getDriver().findElement(By.xpath("//button[text()='Start']")).click();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);
        WebElement text = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                if (Driver.getDriver().findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed()) {
                    return Driver.getDriver().findElement(By.xpath("//div[@id='finish']/h4"));
                } else {
                    return null;
                }
            }
        });
        System.out.println(Driver.getDriver().findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed());
    }
}
