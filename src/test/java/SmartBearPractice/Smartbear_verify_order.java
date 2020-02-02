package SmartBearPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Smartbear_verify_order {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        Smartbear_link_verif.loginToSmartBear(driver);
        //verify the givenName is in the list
        Smartbear_link_verif.verifyOrder(driver,"another name");

        Smartbear_link_verif.printNamesAndCities(driver);
    }
    }

