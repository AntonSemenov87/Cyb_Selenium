package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

public class Actions_practice {
    public static void main(String[] args) throws InterruptedException {
        Driver.getDriver().get("https://www.amazon.com");
        Actions a = new Actions(Driver.getDriver());
        //WebElement hoverOver = Driver.getDriver().findElement(By.xpath(("//span[@class='nav-line-2 '])[1]")));
        //a.moveToElement(hoverOver).build().perform();

        //Thread.sleep(2000);

        WebElement searchField = Driver.getDriver().findElement(By.cssSelector("#twotabsearchtextbox"));
        a.moveToElement(searchField).click().keyDown(Keys.SHIFT).sendKeys("anton").doubleClick().build().perform();
    }
}
