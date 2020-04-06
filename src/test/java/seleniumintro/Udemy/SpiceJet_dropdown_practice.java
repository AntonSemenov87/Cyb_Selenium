package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class SpiceJet_dropdown_practice {
    public static void main(String[] args) throws InterruptedException{
        Driver.getDriver().get("http://spicejet.com");
        Select currencyDropdown = new Select(Driver.getDriver().findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
        currencyDropdown.selectByIndex(3);

        Thread.sleep(3000);

        Driver.getDriver().findElement(By.cssSelector("#divpaxinfo")).click();

        Thread.sleep(2000);
        Select adultsDropdown = new Select(Driver.getDriver().findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
        adultsDropdown.selectByValue("3");

        Driver.getDriver().findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//a[@value='JDH']")).click();

    }
}
