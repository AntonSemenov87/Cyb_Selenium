package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.Driver;

public class SpiceJet_dropdown_practice {
    public static void main(String[] args) throws InterruptedException{
        Driver.getDriver().get("http://spicejet.com");

//        Select currencyDropdown = new Select(Driver.getDriver().findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
//        currencyDropdown.selectByIndex(3);
//        Thread.sleep(3000);
//
//        Driver.getDriver().findElement(By.cssSelector("#divpaxinfo")).click();
//        Thread.sleep(2000);
//        Select adultsDropdown = new Select(Driver.getDriver().findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
//        adultsDropdown.selectByValue("3");
//        String actualInAdultsText = Driver.getDriver().findElement(By.id("divpaxinfo")).getText();
//        String expectedInAdultsText = "3 Adult";
//        Assert.assertEquals(actualInAdultsText, expectedInAdultsText);
//
//        Driver.getDriver().findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
//        Thread.sleep(1000);
//        Driver.getDriver().findElement(By.xpath("//a[@value='JDH']")).click();
//
//        // Checkbox testing
//        WebElement familyCheckbox = Driver.getDriver().findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily"));
//        Assert.assertFalse(familyCheckbox.isSelected());
//        familyCheckbox.click();
//        Assert.assertTrue(familyCheckbox.isSelected());
//        int numOfCheckboxes = Driver.getDriver().findElements(By.xpath("//input[@type='checkbox']")).size();
//        //System.out.println(numOfCheckboxes);
//        Assert.assertEquals(numOfCheckboxes,6);

        // One-way and Round-Trip --> Return Date enabled testing
        // one-way:
        //Driver.getDriver().findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        // round-trip:
        Driver.getDriver().findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(Driver.getDriver().findElement(By.xpath("//div[@class='picker-second']")).getAttribute("style"));



        if(Driver.getDriver().findElement(By.xpath("//div[@class='picker-second']")).getAttribute("style").contains("1")) {
            System.out.println("it's enabled");
            Assert.assertTrue(true);
        } else {
            System.out.println("disabled");
            Assert.assertTrue(false);
        }

        Driver.quitDriver();
    }
}
