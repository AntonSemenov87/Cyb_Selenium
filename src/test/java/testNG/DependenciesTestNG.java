package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTestNG {

    @Test
    public void login () {
        System.out.println("Logging in...");
        Assert.fail("On purpose fail");
    }

    @Test (dependsOnMethods = "login")
    public void makePurchase() {
        System.out.println("Making a purchase...");

    }

    @Test
    public void homePage () {
        System.out.println("Homepage is tested...");
    }
}
