//: Try with resources
//             (try ( ... ) { ... } ) [auto .close()]

package IOAndNIO.IO.WorkingWithTextFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {

        try (FileReader reader =
                     new FileReader("src/main/java/IOAndNIO/WorkingWithTextFile/resources/rubai.txt")) {

            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char)character);
            }
            System.out.println("\n------------------------------");
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
