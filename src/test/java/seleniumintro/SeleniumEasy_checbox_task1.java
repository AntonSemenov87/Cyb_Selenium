package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumEasy_checbox_task1 {
    public static void main(String[] args) {

        //1.Open	Chrome	browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        // 3.Verify	“Success	–Check	box	is	checked”	message	is	NOT displayed.
        WebElement sucessText = driver.findElement(By.xpath("//div[@id='txtAge']"));

        if (!sucessText.isDisplayed()) {
            System.out.println("Success text is NOT displayed - PASS");
        } else {
            System.out.println("Success text IS displayed - FAIL");
        }


        // 4.Click	to	checkbox	under	“Single	Checkbox	Demo”	section
        WebElement button = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        button.click();

        // 5.Verify	“Success	–Check	box	is	checked”	message	isdisplayed.
        if (sucessText.isDisplayed()) {
            System.out.println("Success text IS displayed - PASS");
        } else {
            System.out.println("Success text is NOT displayed - FAIL");
        }

    }
}
