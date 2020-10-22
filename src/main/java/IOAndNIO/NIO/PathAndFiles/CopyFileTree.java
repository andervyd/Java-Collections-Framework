//: Class Files
//      Files.walkFileTree(Path start, FileVisitor visitor);
//  Class SimpleFileVisitor


package IOAndNIO.NIO.PathAndFiles;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) throws IOException {

        Path source = Paths.get("src/main/java/IOAndNIO/NIO/PathAndFiles/resources/FileTree");
        Path destination = Paths.get("src/main/java/IOAndNIO/NIO/PathAndFiles/resources/CopyFileTree");

        Files.walkFileTree(source,new ExtendSimpleFileVisitor(source, destination));

    }
}

class ExtendSimpleFileVisitor extends SimpleFileVisitor<Path> {

    Path source;
    Path destination;

    public ExtendSimpleFileVisitor(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination);

        return FileVisitResult.CONTINUE;
    }


}