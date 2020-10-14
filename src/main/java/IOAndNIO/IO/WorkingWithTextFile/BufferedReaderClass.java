//: BufferedReader example
//       method .readLine()

package IOAndNIO.IO.WorkingWithTextFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClass {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(
                new FileReader("src/main/java/IOAndNIO/WorkingWithTextFile/resources/new_rubai.txt"))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("---------------------------------");
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
