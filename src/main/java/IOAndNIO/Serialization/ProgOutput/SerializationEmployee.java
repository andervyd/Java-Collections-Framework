package IOAndNIO.Serialization.ProgOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEmployee {
    public static void main(String[] args) {

        Car car = new Car("Nissan", "black");
        Employee employee = new Employee("Ivan", "IT-PROG", 26, 2300, car);

        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("src/main/java/IOAndNIO/Serialization/resources/employee_object.bin")
        )) {
            outputStream.writeObject(employee);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
