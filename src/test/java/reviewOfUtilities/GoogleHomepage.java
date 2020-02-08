package reviewOfUtilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleHomepage {
    public GoogleHomepage () {
        PageFactory.initElements(Driver.getDriver(), this);
        // synchronizes the pages and elements
        // makes all below webElements ready to use
    }
        @FindBy(name="q")
            public WebElement searchBox;

    }

