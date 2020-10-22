//: Class Files read/write
//       Files.write(path, byte_array);
//       Files.readAllLines(path);

package IOAndNIO.NIO.PathAndFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesWriteRead {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("src/main/java/IOAndNIO/NIO/PathAndFiles/resources/dialog.txt");

        String dialog = "Laurie:   So, what are your plans for this weekend?\n" +
                        "Christie: I don’t know. Do you want to get together or something?\n" +
                        "Sarah:    How about going to see a movie? Cinemax 26 on Carson Boulevard is showing Enchanted.\n" +
                        "Laurie:   That sounds like a good idea.";

        Files.write(filePath, dialog.getBytes());
        System.out.println("Write to file complete.");

        List<String> list = Files.readAllLines(filePath);
        System.out.println("Read file and write to list complete.");

        for(String string : list) {
            System.out.println(string);
        }
    }
}
