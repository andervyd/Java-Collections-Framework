//: Class Files
//         methods: Files.exists(path)                          Files.createFile(path)
//                  Files.createDirectory(path)                 Files.isReadable()
//                  Files.isWritable()                          Files.isExecutable()
//                  Files.isSameFile(path1, path2)              Files.size()
//                  Files.getAttribute(path, attribute_name)
//                  Files.readAttributes(path, attributes)

//                  Files.copy(path1, path2, copy_options)
//                  Files.move(path1, path2, copy_options)
//                  Files.delete(path)
//                  Files.write(path, byte_array)
//                  Files.readAllLines(path)

package IOAndNIO.NIO.PathAndFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class FilesMethods {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("src" + File.separator + "main" + File.separator + "java" +
                File.separator + "IOAndNIO" + File.separator + "NIO" + File.separator + "PathAndFiles" +
                    File.separator + "resources" + File.separator + "test.txt");
        Path directoryPath = Paths.get("src" + File.separator + "main" +
                    File.separator + "java" + File.separator + "IOAndNIO" + File.separator + "NIO" + File.separator + "PathAndFiles" +
                        File.separator + "resources" + File.separator + "Folder");

        if(!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

        if(!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }

        System.out.println("--------------------------");
        System.out.println(Files.isWritable(filePath));
            // Output: true
        System.out.println(Files.isReadable(filePath));
            // Output: true
        System.out.println(Files.isExecutable(filePath));
            // Output: true

        System.out.println("--------------------------");
        Path filePathNew = Paths.get("src" + File.separator + "main" + File.separator + "java" +
                File.separator + "IOAndNIO" + File.separator + "NIO" + File.separator + "PathAndFiles" +
                    File.separator + "resources" + File.separator + "test2.txt");
        System.out.println(Files.isSameFile(filePath, filePathNew));
            // Output: false

        System.out.println("--------------------------");
        System.out.println(Files.size(filePath));
            // Output: 316

        System.out.println("--------------------------");
        System.out.println(Files.getAttribute(filePath, "creationTime"));
            // Output: 2020-10-15T01:02:46.828279Z
        System.out.println(Files.getAttribute(filePath, "size"));
            // Output: 316

        System.out.println("--------------------------");
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for(Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
            // Output:  lastAccessTime : 2020-10-15T01:32:40.724275Z
            //          lastModifiedTime : 2020-10-15T01:32:40.724275Z
            //          size : 316
            //          creationTime : 2020-10-15T01:02:46.828279Z
            //          isSymbolicLink : false
            //          isRegularFile : true
            //          fileKey : null
            //          isOther : false
            //          isDirectory : false

    }
}