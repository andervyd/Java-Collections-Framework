//: Deserialization with ObjectInputStream example

package IOAndNIO.IO.Serialization.ProgInputOne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializationObject {
    public static void main(String[] args) {

        List<String> inputEmployees;

        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("src/main/java/IOAndNIO/Serialization/resources/employees.bin")
        )) {
            inputEmployees = (ArrayList)inputStream.readObject();
            System.out.println("Reading objects ready" +
                    "\n---------------------");
            System.out.println(inputEmployees);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
