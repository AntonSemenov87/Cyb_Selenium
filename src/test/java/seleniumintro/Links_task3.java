package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Links_task3 {
    public static void main(String[] args) {
        //1.Open	Chrome	browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go	to	https://www.openxcell.com
        driver.get("https://www.openxcell.com");

        // 3.Print out the texts of all links

        List<WebElement> list  = driver.findElements(By.xpath("//body//a"));

        int countOfEmptyLinks = 0;
        for (WebElement e : list) {
            if (e.getText().isEmpty()) {
                countOfEmptyLinks++;
            }
        }
        System.out.println(countOfEmptyLinks);
    }
}
