//: FileReader example
//      FileReader reader = new FileReader()
//           method .read()

package IOAndNIO.IO.WorkingWithTextFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws IOException {

        FileReader reader = null;
        try {
            reader = new FileReader("src/main/java/IOAndNIO/WorkingWithTextFile/resources/rubai.txt");

            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char)character);
            }
            System.out.println("\n------------------------------");
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
