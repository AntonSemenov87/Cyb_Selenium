package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class SpiceJet_order {
    public static void main(String[] args) throws InterruptedException{
        Driver.getDriver().get("http://www.spicejet.com");

        Driver.getDriver().findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        Driver.getDriver().findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Driver.getDriver().findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("mum" + Keys.ARROW_DOWN +Keys.ENTER);
        Driver.getDriver().findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        Driver.getDriver().findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
        Driver.getDriver().findElement(By.id("ctl00_mainContent_view_date1")).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        Driver.getDriver().findElement(By.id("divpaxinfo")).click();
        Select adultNum = new Select(Driver.getDriver().findElement(By.id("ctl00_mainContent_ddl_Adult")));
        adultNum.selectByValue("2");
        Driver.getDriver().findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();



    }
}
