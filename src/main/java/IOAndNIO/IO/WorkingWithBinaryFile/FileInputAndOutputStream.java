//: FileInputStream
//: FileOutputStream

package IOAndNIO.IO.WorkingWithBinaryFile;

import java.io.*;

public class FileInputAndOutputStream {
    public static void main(String[] args) {

        try (FileInputStream inputStream =
                     new FileInputStream("src/main/java/IOAndNIO/WorkingWithBinaryFile/resources/code.png");
             FileOutputStream outputStream =
                     new FileOutputStream("src/main/java/IOAndNIO/WorkingWithBinaryFile/resources/new_code.png")) {
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