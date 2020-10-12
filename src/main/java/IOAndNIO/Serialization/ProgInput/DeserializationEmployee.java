package IOAndNIO.Serialization.ProgInput;

import IOAndNIO.Serialization.ProgOutput.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEmployee {
    public static void main(String[] args) {

        Employee employee;

        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("src/main/java/IOAndNIO/Serialization/resources/employee_object.bin")
        )) {
            employee = (Employee)inputStream.readObject();
            System.out.println(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
