package IOAndNIO.NIO.BufferAndChannel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WriteExample {
    public static void main(String[] args) {

        try(RandomAccessFile file = new RandomAccessFile("src" + File.separator + "main" + File.separator + "java" +
                File.separator + "IOAndNIO" + File.separator + "NIO" + File.separator + "BufferAndChannel" +
                File.separator + "resources" + File.separator + "add_text.txt", "rw");
            FileChannel channel = file.getChannel()) {

            String text = "\nCreate a function that takes an integer and return true" +
                    "\nif it's divisible by 100, otherwise return false.";

    // variant 1: ByteBuffer.allocate()
            ByteBuffer buffer0 = ByteBuffer.allocate(text.getBytes().length);
            buffer0.put(text.getBytes());
            buffer0.flip();

            channel.write(buffer0);

    // variant 2: ByteBuffer.wrap()ё
            ByteBuffer buffer1 = ByteBuffer.wrap(text.getBytes());

            channel.write(buffer1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}