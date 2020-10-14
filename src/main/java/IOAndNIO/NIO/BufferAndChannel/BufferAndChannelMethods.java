//: Buffer and Channel methods:
//      channel.read(buffer)
//      buffer.flip()
//      buffer.hasRemaining()
//      buffer.get()
//      buffer.clear()
//      buffer.put(...)
//      channel.write(buffer)
//      buffer.rewind()
//      buffer.compact()
//      buffer.mark()
//      buffer.reset()

package IOAndNIO.NIO.BufferAndChannel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferAndChannelMethods {
    public static void main(String[] args) {

        try(RandomAccessFile file = new RandomAccessFile("src" + File.separator + "main" + File.separator + "java" +
                File.separator + "IOAndNIO" + File.separator + "NIO" + File.separator + "BufferAndChannel" +
                    File.separator + "resources" + File.separator + "English alphabet.txt", "rw");
        FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();

            System.out.println("-----");
            System.out.println((char)buffer.get()); // byte 1 'A'
            System.out.println((char)buffer.get()); // byte 2 '-'
            System.out.println((char)buffer.get()); // byte 3 'B'

            System.out.println("-----");
            buffer.rewind();

            System.out.println((char)buffer.get()); // byte 1 'A'
            System.out.println((char)buffer.get()); // byte 2 '-'

            System.out.println("-----");
            channel.read(buffer);
            buffer.flip();

            while(buffer.hasRemaining()) {
                System.out.print((char)buffer.get());
            } // bytes A--D-

            System.out.println("\n-----");
            buffer.clear();

            channel.read(buffer);
            buffer.flip();

            System.out.println((char)buffer.get()); // byte 1 'E'

            buffer.mark();

            System.out.println((char)buffer.get()); // byte 1 '-'
            System.out.println((char)buffer.get()); // byte 1 'F'

            buffer.reset();

            System.out.println((char)buffer.get()); // byte 1 '-'
            System.out.println((char)buffer.get()); // byte 1 'F'

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}