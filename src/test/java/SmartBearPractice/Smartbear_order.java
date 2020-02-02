package SmartBearPractice;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;

public class Smartbear_order {
    public static void main(String[] args) {
        //1.Open	browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go	to	website:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // 3.Enter username: “Tester”
        // 4.Enter password: “test”
        // 5.Click on Login button
        Smartbear_link_verif.loginToSmartBear(driver);

        // 6.Click on Order
        WebElement orderButton = driver.findElement(By.xpath("//a[contains(text(),'Order')]"));
        orderButton.click();

        // 7.Select familyAlbum from product, set quantity to 2
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']"));
        Select select = new Select(dropDown);
        select.selectByIndex(1);
        WebElement setQty = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
        setQty.clear();
        setQty.sendKeys("2");

        // 8.Click to “Calculate”button
        WebElement calculateButton = driver.findElement(By.xpath("//ol//input[@class='btn_dark']"));
        calculateButton.click();

        // 9.Fill address Info with JavaFaker•Generate: name, street, city, state, zip code
        Faker faker = new Faker();
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']")).sendKeys(faker.name().fullName());
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")).sendKeys(faker.address().streetName());
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")).sendKeys(faker.address().city());
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']")).sendKeys(faker.address().state());
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")).sendKeys(faker.address().zipCode().substring(0,5));

        // 10.Click on “visa” radio button
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")).click();

        // 11.Generate card number using JavaFaker
        //driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")).sendKeys(faker.finance().creditCard(CreditCardType.VISA));
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")).sendKeys(faker.finance().creditCard().replace("-",""));
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']")).sendKeys("12/24");

        // 12.Click on “Process”
        driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")).click();

        // 13.Verify success message “New order has been successfully added.”
        String expectedText = "New order has been successfully added";
       String actualText = driver.findElement(By.xpath("//strong[contains(text(),'New order has been successfully added.')]")).getText();
        if (actualText.contains(expectedText)) {
            System.out.println("New order was placed - PASS");
        } else {
            System.out.println("Order was NOT placed - FAIL!");
        }


    }



}
