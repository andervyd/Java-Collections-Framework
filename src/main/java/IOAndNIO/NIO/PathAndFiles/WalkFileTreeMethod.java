//: Class Files
//      Files.walkFileTree(Path start, FileVisitor visitor);
//  Interface FileVisitor methods:
//      .preVisitDirectory()
//      .visitFile()
//      .postVisitDirectory()
//      .visitFileFailed()

package IOAndNIO.NIO.PathAndFiles;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkFileTreeMethod {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/home/andervyd/eclipse/workspace/Java-Collections-Framework/" +
                "src/main/java/IOAndNIO/NIO/PathAndFiles/resources/FileTree");

        Files.walkFileTree(path, new ImplementFileVisitor());

    }
}/* Output
            Enter to Directory: /home/andervyd/eclipse/workspace/Java-Collections-Framework/
                src/main/java/IOAndNIO/NIO/PathAndFiles/resources/FileTree
            Enter to Directory: /home/andervyd/eclipse/workspace/Java-Collections-Framework/
                src/main/java/IOAndNIO/NIO/PathAndFiles/resources/FileTree/Folder2
            File name: text4.txt
            Exit from Directory: /home/andervyd/eclipse/workspace/Java-Collections-Framework/
                src/main/java/IOAndNIO/NIO/PathAndFiles/resources/FileTree/Folder2
            Enter to Directory: /home/andervyd/eclipse/workspace/Java-Collections-Framework/
                src/main/java/IOAndNIO/NIO/PathAndFiles/resources/FileTree/Folder3
            Exit from Directory: /home/andervyd/eclipse/workspace/Java-Collections-Framework/
                src/main/java/IOAndNIO/NIO/PathAndFiles/resources/FileTree/Folder3
            Enter to Directory: /home/andervyd/eclipse/workspace/Java-Collections-Framework/
                src/main/java/IOAndNIO/NIO/PathAndFiles/resources/FileTree/Folder1
            Enter to Directory: /home/andervyd/eclipse/workspace/Java-Collections-Framework/
                src/main/java/IOAndNIO/NIO/PathAndFiles/resources/FileTree/Folder1/InnerFolder2
            Exit from Directory: /home/andervyd/eclipse/workspace/Java-Collections-Framework/
                src/main/java/IOAndNIO/NIO/PathAndFiles/resources/FileTree/Folder1/InnerFolder2
            Enter to Directory: /home/andervyd/eclipse/workspace/Java-Collections-Framework/
                src/main/java/IOAndNIO/NIO/PathAndFiles/resources/FileTree/Folder1/InnerFolder1
            File name: text1.txt
            File name: text2.txt
            File name: text3.txt
            Exit from Directory: /home/andervyd/eclipse/workspace/Java-Collections-Framework/
                src/main/java/IOAndNIO/NIO/PathAndFiles/resources/FileTree/Folder1/InnerFolder1
            Exit from Directory: /home/andervyd/eclipse/workspace/Java-Collections-Framework/
                src/main/java/IOAndNIO/NIO/PathAndFiles/resources/FileTree/Folder1
            Exit from Directory: /home/andervyd/eclipse/workspace/Java-Collections-Framework/
                src/main/java/IOAndNIO/NIO/PathAndFiles/resources/FileTree
*///:~

class ImplementFileVisitor implements FileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Enter to Directory: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error while visiting file: " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exit from Directory: " + dir);
        return FileVisitResult.CONTINUE;
    }
}