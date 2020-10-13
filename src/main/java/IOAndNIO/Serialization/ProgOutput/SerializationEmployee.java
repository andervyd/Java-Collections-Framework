package IOAndNIO.Serialization.ProgOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEmployee {
    public static void main(String[] args) {

        Car car = new Car("Nissan", "black");

//        Employee employee = new Employee("Mary", "IT-PROG", 23,2300, car);          // serial version UID: 1
        Employee newEmployee = new Employee("Mary", "Rose", "IT-PROG", 2300, car);  // serial version UID: 2

        try( ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("src/main/java/IOAndNIO/Serialization/resources/employee_object.bin"));
             ObjectOutputStream newOutputStream = new ObjectOutputStream(
                     new FileOutputStream("src/main/java/IOAndNIO/Serialization/resources/employee_reObject.bin"))) {
//            outputStream.writeObject(employee);
            newOutputStream.writeObject(newEmployee);

            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
