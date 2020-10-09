//: FileInputStream
//: FileOutputStream

package IOAndNIO.WorkingWithTextFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputAndOutputStream {
    public static void main(String[] args) {

        try (FileInputStream inputStream =
                     new FileInputStream("src/main/java/IOAndNIO/WorkingWithTextFile/resources/code.png");
             FileOutputStream outputStream =
                     new FileOutputStream("src/main/java/IOAndNIO/WorkingWithTextFile/resources/new_code.png")) {
            int input;
            while((input = inputStream.read()) != -1) {
                outputStream.write(input);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}