package seleniumintro;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Links_task1 {
    public static void main(String[] args) {
        //1.Open	Chrome	browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go	to	https://www.openxcell.com
        driver.get("https://www.openxcell.com");

        // 3.Count	the	number	of	the	links	on	the	page	and	verifyExpected:
        // Expected: 188

        List<WebElement> list  = driver.findElements(By.xpath("//body//a"));
        int number = list.size();
        System.out.println(number);
    }
}
