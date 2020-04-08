package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GreenKart_addingItemsList_remake {
    public static void main(String[] args) {
        Driver.getDriver().get("https://www.rahulshettyacademy.com/seleniumPractise/");
        String[] itemsNeeded = {"Brocolli", "Carrot", "Cucumber"};
        // IMPLICIT WAIT here
        //Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // calling method below
        addItems(itemsNeeded);

        // cart interaction after method
        Driver.getDriver().findElement(By.xpath("//img[@alt='Cart']")).click();
        Driver.getDriver().findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        Driver.getDriver().findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
        Driver.getDriver().findElement(By.xpath("//button[@class='promoBtn']")).click();
        // explicit wait to verify text is displayed under the Apply button
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
        String promoResult = Driver.getDriver().findElement(By.cssSelector(".promoInfo")).getText();
        System.out.println(promoResult);
        Driver.getDriver().findElement(By.xpath("//button[text()='Place Order']")).click();

        Select selectCountry = new Select(Driver.getDriver().findElement(By.xpath("//select[@style='width: 200px;']")));
        selectCountry.selectByValue("United States");
        Driver.getDriver().findElement(By.cssSelector("input.chkAgree")).click();
        Driver.getDriver().findElement(By.xpath("//button[text()='Proceed']")).click();


    }

    public static void addItems(String[] itemsNeeded) {

        int j = 0;

        List<WebElement> products = Driver.getDriver().findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {
            // Broccoli - 1 Kg
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();

            List itemsNeededList = Arrays.asList(itemsNeeded);

            if (itemsNeededList.contains(formattedName)) {
                j++;
                Driver.getDriver().findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                //Thread.sleep(4000);
                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }

    }


}
