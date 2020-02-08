package reviewOfUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import utilities.Driver;

import java.io.FileInputStream;
import java.util.Properties;

public class ReviewFile {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream("review.properties");
        properties.load(file);
        String str = properties.getProperty("day");
        System.out.println(str);

        Driver.getDriver().get(properties.getProperty("url"));
        Driver.getDriver().findElement(By.name("q")).sendKeys(properties.getProperty("item")+ Keys.ENTER);

        System.out.println(Driver.getDriver().getTitle());
        Driver.getDriver().quit();
    }
}
