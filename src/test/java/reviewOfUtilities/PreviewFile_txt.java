package reviewOfUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PreviewFile_txt {
    public static void main(String[] args) throws Exception {
        File file = new File ("/Users/AntonSemenov/Desktop/test.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
//        System.out.println(scanner.nextLine());
    }
}
