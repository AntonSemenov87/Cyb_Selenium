package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import utilities.Driver;

import java.util.Iterator;
import java.util.Set;

public class Udemy_randomTasks {
    public static void main(String[] args) throws InterruptedException {

        // Task 1:
        //count of links on the page
        Driver.getDriver().get("http://www.qaclickacademy.com/practice.php");
        // all links start with <a  >
        System.out.println("Num of all links on page: " + Driver.getDriver().findElements(By.tagName("a")).size());


        // Task 2:
        // count links in footer section -- limit scope
        WebElement footer = Driver.getDriver().findElement(By.id("gf-BIG"));
        System.out.println("Number of links in footer: " + footer.findElements(By.tagName("a")).size());

        // Task 3:
        // count links in footer of first column
        WebElement leftColumn = footer.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
        System.out.println("Number of links in left column of footer: " + leftColumn.findElements(By.tagName("a")).size());

        // Task 4:
        // click on each link and check if pages open

        WebElement coloumndriver = leftColumn.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(coloumndriver.findElements(By.tagName("a")).size());

        //4- click on each link in the coloumn and check if the pages are opening-
        for (int i = 1; i < leftColumn.findElements(By.tagName("a")).size(); i++ ) {
            String clickOnLinkTab = Keys.chord(Keys.COMMAND, Keys.ENTER);

            leftColumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
            Thread.sleep(5000);

        }
            // opens all tabs
            Set<String> handles = Driver.getDriver().getWindowHandles(); //4 other windows
            Iterator<String> iterator = handles.iterator();


            // while there are tabs - keep switching to them
            while (iterator.hasNext()) {
                Driver.getDriver().switchTo().window(iterator.next());
                System.out.println(Driver.getDriver().getTitle());
            }
        }

    }

