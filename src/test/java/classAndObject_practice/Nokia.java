package classAndObject_practice;

public class Nokia {

    static int count = 10000;

    int memory;
    String OS;
    String color;
    boolean is5G;

    public Nokia(int memory, String OS, String color, boolean is5G){
        this.memory = memory;
        this.OS = OS;
        this.color = color;
        this.is5G = is5G;
        count--;
    }

}
