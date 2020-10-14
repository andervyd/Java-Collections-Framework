//: class File
//      methods: .getAbsolutePath()     .isAbsolute()        .isDirectory()
//               .exists()              .createNewFile()     .mkdir()
//               .length()              .delete()            .listFiles()
//               .isHidden()            .canRead()           .canWrite()
//               .canExecute()

package IOAndNIO.IO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileClass {
    public static void main(String[] args) throws IOException {

        File file = new File("src\\main\\java\\IOAndNIO\\IO\\resources\\file.txt");
        File file2 = new File("src\\main\\java\\IOAndNIO\\IO\\resources\\file2.txt");
        File folder = new File("d:\\JAVA\\Java_learn\\" +
                "Java-Collections-Framework\\src\\main\\java\\IOAndNIO\\IO\\resources");
        File folder2 = new File("d:\\JAVA\\Java_learn\\" +
                "Java-Collections-Framework\\src\\main\\java\\IOAndNIO\\IO\\resources\\folder");

// .getAbsolutePath()
        System.out.println("-----------------------------------------");
        System.out.println(file.getAbsolutePath());
            // Output: D:\JAVA\Java_learn\Java-Collections-Framework\src\main\java\IOAndNIO\IO\resources\file.txt
        System.out.println(folder.getAbsolutePath());
            // Output: d:\JAVA\Java_learn\Java-Collections-Framework\src\main\java\IOAndNIO\IO\resources

// .isAbsolute()
        System.out.println("-----------------------------------------");
        System.out.println(file.isAbsolute());
            // Output: false
        System.out.println(folder.isAbsolute());
            // Output: true

// .isDirectory()
        System.out.println("-----------------------------------------");
        System.out.println(file.isDirectory());
            // Output: false
        System.out.println(folder.isDirectory());
            // Output: true

// .exists()
        System.out.println("-----------------------------------------");
        System.out.println(file.exists());
            // Output: true
        System.out.println(file2.exists());
            // Output: false
        System.out.println(folder.exists());
            // Output: true
        System.out.println(folder2.exists());
            // Output: false

// .createNewFile()
        System.out.println("-----------------------------------------");
        System.out.println(file2.createNewFile());
            // Output: true

// .mkdir()
        System.out.println("-----------------------------------------");
        System.out.println(folder2.mkdir());
            // Output: true

// .length()
        System.out.println("-----------------------------------------");
        System.out.println(file2.length());
            // Output: 12 (byte)
        System.out.println(folder.length());
            // Output: 0

// .delete()
        System.out.println("-----------------------------------------");
        System.out.println(file2.delete());
            // Output: true
        System.out.println(folder2.delete()); // folder must be empty!
            // Output: true

// .listFiles()
        System.out.println("-----------------------------------------");
        File[] arrayFile = folder.listFiles();
        System.out.println(Arrays.toString(arrayFile));
            // Output: [d:\JAVA\Java_learn\Java-Collections-Framework\src\main\java\IOAndNIO\IO\resources\arr0.txt,
            //              d:\JAVA\Java_learn\Java-Collections-Framework\src\main\java\IOAndNIO\IO\resources\arr1.txt,
            //                  d:\JAVA\Java_learn\Java-Collections-Framework\src\main\java\IOAndNIO\IO\resources\file.txt,
            //                      d:\JAVA\Java_learn\Java-Collections-Framework\src\main\java\IOAndNIO\IO\esources\Test]

// .isHidden()
        System.out.println("-----------------------------------------");
        System.out.println(file.isHidden());
            // Output: false

// .canRead()
        System.out.println("-----------------------------------------");
        System.out.println(file.canRead());
            // Output: true

// .canWrite()
        System.out.println("-----------------------------------------");
        System.out.println(file.canWrite());
            // Output: true

// .canExecute()
        System.out.println("-----------------------------------------");
        System.out.println(file.canExecute());
            // Output: true

    }
}
