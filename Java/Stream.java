package day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    public static void main(String args[]) {
        // Use try-with-resources for automatic resource management
        try (FileInputStream inputStream = new FileInputStream("input.txt");
             FileOutputStream outputStream = new FileOutputStream("out.txt")) {

            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
