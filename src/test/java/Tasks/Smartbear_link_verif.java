package Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Smartbear_link_verif {
    public static void main(String[] args) {
        //1. Open	browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go	to	website:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

//        // 3.Enter username: “Tester”
//        WebElement username = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
//        username.sendKeys("Tester");
//
//        // 4.Enter password: “test”
//        WebElement password = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
//        password.sendKeys("test");
//
//
//        // 5.Click to Login button
//        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
//        loginButton.click();

        // OR
        loginToSmartBear(driver);


        // 6.Print out count of all the links on landing page

        List<WebElement> list =  driver.findElements(By.xpath("//body//a"));
        System.out.println(list.size());



        // 7.Print out each link text on this page

        for (WebElement link: list) {
            System.out.println(link.getText());
        }

    }

    public static void loginToSmartBear(WebDriver driver) {
        WebElement username = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys("test");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
    }
}
