package SmartBearPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SmartBear_orderVerif {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.xpath("//a[contains(text(),'View all orders')]")).click();

        WebElement susanDate = driver.findElement(By.xpath("//td[.='Susan McLaren']/../td[5]"));
        WebElement susanDate2 = driver.findElement(By.xpath("//td[.='Susan McLaren]/following-sibling::td[3]"));

        String expectedDate = "01/05/2010";
        String actualDate = susanDate.getText();
        if (actualDate.equals(expectedDate)){
            System.out.println("Date is as expected. Verification PASSED!");
        }else{
            System.out.println("Date is not as expected. Verification FAILED!!!");
        }

        driver.quit();
    }
}
