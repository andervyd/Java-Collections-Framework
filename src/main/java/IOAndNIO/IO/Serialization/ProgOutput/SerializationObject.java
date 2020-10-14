//: Serialization with ObjectOutputStream example

package IOAndNIO.IO.Serialization.ProgOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationObject {
    public static void main(String[] args) {

        List<String> outputEmployees = new ArrayList<>();

        outputEmployees.add("John");
        outputEmployees.add("Lee");
        outputEmployees.add("Mary");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("src/main/java/IOAndNIO/Serialization/resources/employees.bin"))) {
            outputStream.writeObject(outputEmployees);
            System.out.println("Object recording ready");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
