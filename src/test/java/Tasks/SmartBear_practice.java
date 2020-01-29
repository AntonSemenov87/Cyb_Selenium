package Tasks;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SmartBear_practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // username
        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUsername.sendKeys("Tester");

        // password
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");

        // login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        // Order link
        WebElement orderButton = driver.findElement(By.linkText("Order"));
        orderButton.click();

        // select item in dropdown
        WebElement dropdown = driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select select = new Select(dropdown);
        select.selectByIndex(2);

        //fillout form
        WebElement setQuantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        setQuantity.clear();
        setQuantity.sendKeys("4");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount")).sendKeys("13");
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();

        // Address info using JavaFaker
        Faker faker = new Faker();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(faker.name().fullName());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(faker.address().streetName());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(faker.address().city());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(faker.address().state());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(faker.address().zipCode().substring(0,5));

        //Payment Info
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(faker.finance().creditCard().replace("-", ""));
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("12/24");

        // Submitting
        WebElement submit = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        submit.click();

        // Verifying order is placed message
        String expectedMessage = "New order has been successfully added.";
        String actualMessage = driver.findElement(By.xpath("//div[@class='buttons_process']/strong")).getText();
        if (actualMessage.contains(expectedMessage)) {
            System.out.println("Order was placed successfully - PASS!");
        } else {
            System.out.println("Order wasn't placed - FAILED!!!");
        }

        driver.quit();







    }
}
