//: Class Files
//         methods: Files.copy(path1, path2, copy_options);
//                  Files.move(path1, path2, copy_options);
//                  Files.delete(path);

package IOAndNIO.NIO.PathAndFiles;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesMethods2 {
    public static void main(String[] args) throws IOException {


        Path filePath = Paths.get("/home/andervyd/eclipse/workspace/Java-Collections-Framework/" +
                "src/main/java/IOAndNIO/NIO/PathAndFiles/resources/test.txt");


        Path directoryOPath= Paths.get("/home/andervyd/eclipse/workspace/Java-Collections-Framework/" +
                "src/main/java/IOAndNIO/NIO/PathAndFiles/resources");

        Path directoryPath= Paths.get("/home/andervyd/eclipse/workspace/Java-Collections-Framework/" +
                "src/main/java/IOAndNIO/NIO/PathAndFiles/resources/Folder");

        Path directoryFolder2Path= Paths.get("/home/andervyd/eclipse/workspace/Java-Collections-Framework/" +
                "src/main/java/IOAndNIO/NIO/PathAndFiles/resources/Folder2");

//        Files.copy(filePath, directoryPath.resolve("test.txt"));

//        Files.copy(filePath, directoryPath.resolve("test.txt"), StandardCopyOption.REPLACE_EXISTING);

//        Files.copy(directoryFolder2Path, directoryPath.resolve("Folder2"));

//        Files.move(directoryFolder2Path, directoryOPath.resolve("NewFolder"));

//        Files.move(Paths.get("src/main/java/IOAndNIO/NIO/PathAndFiles/resources/NewFolder"),
//                Paths.get("src/main/java/IOAndNIO/NIO/PathAndFiles/resources/ReNewFolder"));

//        Files.delete(Paths.get("src/main/java/IOAndNIO/NIO/PathAndFiles/resources/ReNewFolder/new_test.txt"));
//        Files.delete(Paths.get("src/main/java/IOAndNIO/NIO/PathAndFiles/resources/ReNewFolder"));

        System.out.println("Done");

    }
}
