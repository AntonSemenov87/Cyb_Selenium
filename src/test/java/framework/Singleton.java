package framework;

public class Singleton {

    // no ability to create Object of this class - created private constructor
    private Singleton () {

    }

    private static String word;

    public static String getWord () {

        if (word == null) {
            System.out.println("First set up");
            word = "I have a value now";
        } else {
            System.out.println("Already has a value");
        }
        return word;
    }



}
