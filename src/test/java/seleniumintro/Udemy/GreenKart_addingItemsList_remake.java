package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.Arrays;
import java.util.List;

public class GreenKart_addingItemsList_remake {
    public static void main(String[] args) {
        Driver.getDriver().get("https://www.rahulshettyacademy.com/seleniumPractise/");
        String[] itemsNeeded = {"Brocolli", "Carrot", "Cucumber"};

        // calling method below
        addItems(itemsNeeded);

        // cart interaction after method
        Driver.getDriver().findElement(By.xpath("//img[@alt='Cart']")).click();



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
