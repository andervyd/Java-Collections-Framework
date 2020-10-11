//: DataInputStream
//  DataOutputStream

package IOAndNIO.WorkingWithBinaryFile;

import java.io.*;

public class DataInputAndOutputStream {
    public static void main(String[] args) {

        try (DataOutputStream output = new DataOutputStream(
                new FileOutputStream("src/main/java/IOAndNIO/WorkingWithBinaryFile/resources/new_binary.bin"));
            DataInputStream input = new DataInputStream(
                    new FileInputStream("src/main/java/IOAndNIO/WorkingWithBinaryFile/resources/binary.bin"))) {

            output.writeChar('A');
            output.writeBoolean(true);
            output.writeDouble(3.14);
            output.writeInt(12);

            System.out.println(input.readChar());
            System.out.println(input.readBoolean());
            System.out.println(input.readDouble());
            System.out.println(input.readInt());

            System.out.println("--------");
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
