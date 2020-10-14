//: Work classes Buffer and Channel
//     ByteBuffer class; FileChannel class.

package IOAndNIO.NIO.BufferAndChannel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExampleWork {
    public static void main(String[] args) {

        try(RandomAccessFile file = new RandomAccessFile("src" + File.separator + "main" + File.separator + "java" +
                File.separator + "IOAndNIO" + File.separator + "NIO" + File.separator + "BufferAndChannel" +
                    File.separator + "resources" + File.separator + "He Wishes For The Cloths Of Heaven.txt", "rw");
            FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(25);

            StringBuilder poem = new StringBuilder();

            int byteRead = channel.read(buffer);
            while(byteRead > 0) {
                System.out.println("Read: " + byteRead);

                buffer.flip();

                while(buffer.hasRemaining()) {
                    poem.append((char)buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(poem);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
