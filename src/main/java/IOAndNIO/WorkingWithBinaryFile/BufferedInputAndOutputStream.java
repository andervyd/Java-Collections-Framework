//: BufferedInputStream (FileInputStream)
//: BufferedOutputStream (FileOutputStream)

package IOAndNIO.WorkingWithBinaryFile;

import java.io.*;

public class BufferedInputAndOutputStream {
    public static void main(String[] args) {

        try (BufferedInputStream inputStream =
                     new BufferedInputStream(
                             new FileInputStream("src/main/java/IOAndNIO/WorkingWithBinaryFile/resources/code.png"));
             BufferedOutputStream outputStream =
                     new BufferedOutputStream(
                             new FileOutputStream("src/main/java/IOAndNIO/WorkingWithBinaryFile/resources/new_code.png"))) {
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
