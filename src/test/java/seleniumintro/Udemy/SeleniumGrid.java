package seleniumintro.Udemy;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.WIN10);


        // Webdriver driver = new ChromeDriver();
        WebDriver driver = new RemoteWebDriver(new URL("http://10.0.1.10:4444/wd/hub"),dc);
        driver.get("https://www.google.com");

    }
}
