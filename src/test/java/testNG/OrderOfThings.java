package testNG;

import org.testng.annotations.Test;

public class OrderOfThings {

    @Test // (priority = 0)
    public void firstTest () {
        System.out.println("test one is running");
    }

    @Test (priority = 1)
    public void b_secondTest() {
        System.out.println("test two is running");
    }

    @Test (priority = 1)
    public void a_thirdTest() {
        System.out.println("test three is running");
    }

    @Test (priority = -1) // will be executed the very first
    public void fourthTest () {
        System.out.println("test four is running");
    }
}
