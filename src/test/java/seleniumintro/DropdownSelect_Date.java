package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropdownSelect_Date {
    public static void main(String[] args) {
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 3.Verify “Select your date of birth” dropdown are selected today's date by default.
        WebElement day = driver.findElement(By.id("day"));
        Select dayDropDown = new Select(day);
        String actualDayInDropDown = dayDropDown.getFirstSelectedOption().getText();
        String expectedDay = "26";


        WebElement month = driver.findElement(By.id("month"));
        Select monthDropDown = new Select(month);
        String actualMonthInDropDown = monthDropDown.getFirstSelectedOption().getText();
        String expectedMonth = "January";

        WebElement year = driver.findElement(By.id("year"));
        Select yearDropDown = new Select(year);
        String actualYearInDropDown = yearDropDown.getFirstSelectedOption().getText();
        String expectedYear = "2020";

        if (actualDayInDropDown.equals(expectedDay) && actualMonthInDropDown.equals(expectedMonth) && actualYearInDropDown.equals(expectedYear)) {
            System.out.println("default values are correct - PASS");
        } else  {
            System.out.println("default values are incorrect = FAILED");
        }


        // 4.Select “December 31st, 1921” and verify it is selected.
        // Use all Select options
        yearDropDown.selectByValue("1921");
        monthDropDown.selectByIndex(11);
        dayDropDown.selectByVisibleText("31");

        String expectedDaySelected = "31";
        String expectedMonthSelected = "December";
        String expectedYearSelected = "1921";

        String actualDaySelected = dayDropDown.getFirstSelectedOption().getText();
        String actualMonthSelected = monthDropDown.getFirstSelectedOption().getText();
        String actualYearSelected = yearDropDown.getFirstSelectedOption().getText();

        if (expectedDaySelected.equals(actualDaySelected) && expectedMonthSelected.equals(actualMonthSelected) && expectedYearSelected.equals(actualYearSelected)) {
            System.out.println("Date is correct. Selected values verification PASSED");
        } else {
            System.out.println("Date is NOT correct. Selected values verification FAILED");
        }

        driver.quit();

    }
}
