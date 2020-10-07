package testNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGClass {
//    public static void main(String[] args) {
//    }
    @BeforeClass
    public void setUp () {
        System.out.println("BeforeClass is running");
    }

    @Test
    public void bfirstTest(){
        System.out.println("1st test is running...");
        Assert.assertEquals("actualValue", "actualValue", "1st test is failed");
        Assert.assertEquals(1, 1, "Integer TC failed");
    }

    @Test
    public void asecondTest() {
        String letter ="e";
        Assert.assertTrue("sentence".contains(letter), "Sentence doesn't contain " + letter);
        Assert.assertFalse("sentence".contains("s"), "this TC should fail");
        System.out.println("2nd test is running...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod is running...");
    }






}

