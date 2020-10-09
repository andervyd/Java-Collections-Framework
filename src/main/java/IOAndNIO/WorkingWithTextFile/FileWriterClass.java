//: FileWriter example
//     FileWriter writer = new FileWriter("path to file", true); [append - true]
//         method .write()

package IOAndNIO.WorkingWithTextFile;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) throws IOException {

        String rubai = "For many years I have pondered over earthly life.\n" +
                       "There is no incomprehensible thing for me under the moon.\n" +
                       "I know I don't know anything!\n" +
                       "Here is the last truth I discovered.";

        FileWriter writer = null;

        try {
             writer = new FileWriter("/home/andervyd/eclipse/workspace" +
                "/Java-Collections-Framework/src/main/java/IOAndNIO/WorkingWithTextFile/resources/rubai.txt");
            for(int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
