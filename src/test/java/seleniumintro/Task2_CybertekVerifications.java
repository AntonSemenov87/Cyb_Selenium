package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_CybertekVerifications {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.cybertekschool.com");
        Thread.sleep(4000);

        String expectedTitle = "Cybertek";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("cybertek title TC PASSED");
        } else {
            System.out.println("cybertek title TC FAILED!");
        }


        String expectedInURL = "cybertekshool";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedInURL)) {
            System.out.println("cybertek URL verification PASSED");
        } else {
            System.out.println("cybertek URL verification FAILED");
        }

        driver.close();

    }
}
