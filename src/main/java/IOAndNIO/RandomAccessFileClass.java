//: RandomAccessFile
//       methods: .read()
//                .readLine()
//                .seek()
//                .getFilePointer()
//                .write()

package IOAndNIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileClass {
    public static void main(String[] args) {

        try(RandomAccessFile file = new RandomAccessFile("src/main/java/IOAndNIO/WorkingWithTextFile/resources/He Wishes For The Cloths Of Heaven.txt", "rw")) {

            int character = file.read();
            System.out.println((char)character);
                // pointer => start 'H'

            character = file.read();
            System.out.println((char)character);
                // pointer => next 'a'

            String line = file.readLine();
            System.out.println(line);
                // pointer => next " Wishes For The Cloths Of Heaven"

            file.seek(100);
            String newLine = file.readLine();
            System.out.println(newLine);
                // pointer => 100 "and silver light,"

            long position = file.getFilePointer();
            System.out.println(position);
                // pointer => position 119

            file.seek(file.length() - 1); // add author to ending
            file.writeBytes("\n\n\t\t\t\t\tby William Butler Yeats");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
