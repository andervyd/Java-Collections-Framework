//: Interface Path
//      methods: path.getFileName()       path.getParent()
//               path.getRoot()           path.isAbsolute()
//               path.toAbsolutePath()    path1.resolve(path2)
//                                        path1.relative(path2)

package IOAndNIO.NIO.PathAndFiles;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethods {
    public static void main(String[] args) {

        Path filePath = Paths.get("src" + File.separator + "main" + File.separator + "java" +
                File.separator + "IOAndNIO" + File.separator + "NIO" + File.separator + "PathAndFiles" +
                    File.separator + "resources" + File.separator + "test.txt");
        Path directoryPath = Paths.get("D:" + File.separator + "JAVA" + File.separator + "Java_learn" +
                File.separator + "Java-Collections-Framework" + File.separator + "src" + File.separator + "main" +
                    File.separator + "java" + File.separator + "IOAndNIO" + File.separator + "NIO" + File.separator + "PathAndFiles" +
                        File.separator + "resources" + File.separator + "Folder");

        System.out.println("------------------------------");
        System.out.println(filePath.getFileName());
            // Output: test.txt
        System.out.println(directoryPath.getFileName());
            // Output: Folder

        System.out.println("------------------------------");
        System.out.println(filePath.getParent());
            // Output: src\main\java\IOAndNIO\NIO\PathAndFiles\resources
        System.out.println(directoryPath.getParent());
            // D:\JAVA\Java_learn\Java-Collections-Framework\src\main\java\IOAndNIO\NIO\PathAndFiles\resources

        System.out.println("------------------------------");
        System.out.println(filePath.getRoot());
            // Output: null
        System.out.println(directoryPath.getRoot());
            // Output: D:\

        System.out.println("------------------------------");
        System.out.println(filePath.isAbsolute());
            // Output: false
        System.out.println(directoryPath.isAbsolute());
            // Output: true

        System.out.println("------------------------------");
        System.out.println(filePath.toAbsolutePath());
            // Output: D:\JAVA\Java_learn\Java-Collections-Framework\src\main\java\IOAndNIO\NIO\PathAndFiles\resources\test.txt
        System.out.println(directoryPath.toAbsolutePath());
            // Output: D:\JAVA\Java_learn\Java-Collections-Framework\src\main\java\IOAndNIO\NIO\PathAndFiles\resources\Folder

        System.out.println("------------------------------");
        System.out.println(directoryPath.resolve(filePath));
        // Output: D:\JAVA\Java_learn\Java-Collections-Framework\src\main\java\IOAndNIO\NIO\PathAndFiles\resources\
        //                  Folder\src\main\java\IOAndNIO\NIO\PathAndFiles\resources\test.txt

        System.out.println("------------------------------");
        Path anothePath = Paths.get("D:" + File.separator + "JAVA" + File.separator + "Java_learn" +
                File.separator + "Java-Collections-Framework" + File.separator + "src" + File.separator + "main" +
                File.separator + "java" + File.separator + "IOAndNIO" + File.separator + "NIO" + File.separator + "PathAndFiles" +
                File.separator + "resources" + File.separator + "Folder"+ File.separator + "NewFolder"+ File.separator + "EndFolder");
        System.out.println(directoryPath.relativize(anothePath));
            // Output: NewFolder\EndFolder

    }
}
