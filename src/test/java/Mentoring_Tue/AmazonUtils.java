package Mentoring_Tue;

import org.jsoup.Connection;
import org.openqa.selenium.By;

public class AmazonUtils extends BasePage {
    public void clickCategory(String categoryName) {
        driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible']//div[contains(text())]")).click();
    }


}
