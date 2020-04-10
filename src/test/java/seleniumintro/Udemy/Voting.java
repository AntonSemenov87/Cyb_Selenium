package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Voting {
    public static void main(String[] args) throws InterruptedException {

        int i = 0;
        while (i < 3) {
            Driver.getDriver().get("https://sp.muz-tv.ru/bali/voting");
            Thread.sleep(2000);

            Driver.getDriver().findElement(By.xpath("//button[@data-id='1']")).click();

            Thread.sleep(5000);
            Driver.quitDriver();
            i++;
        }

    }
}
