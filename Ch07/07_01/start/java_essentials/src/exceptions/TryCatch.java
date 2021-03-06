package exceptions;

import java.io.File;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {
        File file = new File("a/file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Sorry, unable to create file");
        }

    }
}
