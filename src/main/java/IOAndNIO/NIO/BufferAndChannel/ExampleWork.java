//: Work classes Buffer and Channel
//     ByteBuffer class; FileChannel class.

package IOAndNIO.NIO.BufferAndChannel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExampleWork {
    public static void main(String[] args) {

        try(RandomAccessFile file = new RandomAccessFile("" +
                "src\\main\\java\\IOAndNIO\\NIO\\BufferAndChannel\\resources\\He Wishes For The Cloths Of Heaven.txt", "rw");
            FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(25);

            StringBuilder poem = new StringBuilder();

            int byteRead = channel.read(buffer);
            while(byteRead > 0) {
                System.out.println("Read: " + byteRead);

                buffer.flip();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
