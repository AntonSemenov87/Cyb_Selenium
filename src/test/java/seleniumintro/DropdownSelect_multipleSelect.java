package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownSelect_multipleSelect {
    public static void main(String[] args) throws InterruptedException {
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 3.Select all the options from multiple select dropdown.

                        // OPTION 1
//        WebElement java = driver.findElement(By.xpath("//option[@value='java']"));
//        java.click();
//        WebElement js = driver.findElement(By.xpath("//option[@value='js']"));
//        js.click();
//        WebElement csharp = driver.findElement(By.xpath("//option[@value='c#']"));
//        csharp.click();
//        WebElement python = driver.findElement(By.xpath("//option[@value='python']"));
//        python.click();
//        WebElement ruby = driver.findElement(By.xpath("//option[@value='ruby']"));
//        ruby.click();
//        WebElement c = driver.findElement(By.xpath("//option[@value='c']"));
//        c.click();

                         // OPTION 2
        Select multipleSelectDropDown = new Select(driver.findElement(By.name("Languages")));
        List <WebElement> options = multipleSelectDropDown.getOptions();

        for (WebElement option: options) {
            Thread.sleep(500);
            option.click();
        }


        // 4.Print out all selected values.

       List<WebElement> selectedOptions =  multipleSelectDropDown.getAllSelectedOptions();
        for (WebElement selectedOption : selectedOptions) {
            System.out.println(selectedOption.getText());
        }


        // 5.Deselect all values.
        Thread.sleep(1000);
        multipleSelectDropDown.deselectAll();
    }
}
