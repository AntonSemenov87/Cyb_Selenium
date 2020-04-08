package seleniumintro.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

public class Frames_practice {
    public static void main(String[] args) {
        Driver.getDriver().get("http://jqueryui.com/droppable/");
        // seeing the number of iframes on HTML
        int size = Driver.getDriver().findElements(By.tagName("iframe")).size();
        System.out.println(size);

        Driver.getDriver().switchTo().frame(0);
        String text = Driver.getDriver().findElement(By.cssSelector(".ui-widget-content.ui-draggable.ui-draggable-handle")).getText();
        System.out.println(text);

        Driver.getDriver().switchTo().defaultContent();
        System.out.println(Driver.getDriver().findElement(By.cssSelector(".desc")).getText());


        // dragging and dropping TASK
        Driver.getDriver().switchTo().frame(0);
        Actions actions = new Actions(Driver.getDriver());
        WebElement sourceSquare = Driver.getDriver().findElement(By.cssSelector(".ui-widget-content.ui-draggable.ui-draggable-handle"));
        WebElement targetSquare = Driver.getDriver().findElement(By.cssSelector(".ui-widget-header.ui-droppable"));
        actions.dragAndDrop(sourceSquare, targetSquare).build().perform();




        Driver.quitDriver();
    }
}
