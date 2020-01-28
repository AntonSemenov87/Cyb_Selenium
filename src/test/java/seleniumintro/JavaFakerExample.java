package seleniumintro;

import com.github.javafaker.Faker;
import com.github.javafaker.FunnyName;

public class JavaFakerExample {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String fullname = faker.name().fullName();
        String firstName = faker.name().firstName();

        System.out.println(fullname);
        System.out.println(firstName);


    }

}
