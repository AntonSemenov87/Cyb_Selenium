package framework;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

@Test
    public void test1() throws IOException {
//    1) create the path  of the file;
    String path = "test.properties";

//    2) Properties Object;
    Properties properties = new Properties();

//    3) open the file using FileInputStream
    FileInputStream file = new FileInputStream(path);

//    4) load the properties file into the properties Object
    properties.load(file);

//    5) read the values using getProperty() method
    System.out.println(properties.getProperty("name"));
    System.out.println(properties.getProperty("username"));
    System.out.println(properties.getProperty("password"));

}



}
