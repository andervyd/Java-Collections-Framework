//: BufferedWriter example

package IOAndNIO.IO.WorkingWithTextFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {
    public static void main(String[] args) {

        String rubai = "For many years I have pondered over earthly life.\n" +
                "There is no incomprehensible thing for me under the moon.\n" +
                "I know I don't know anything!\n" +
                "Here is the last truth I discovered.";

        try (BufferedWriter writer = new BufferedWriter(
                        new FileWriter("src/main/java/IOAndNIO/WorkingWithTextFile/resources/new_rubai.txt"))) {
            for(int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
