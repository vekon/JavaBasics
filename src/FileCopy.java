import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        File srcfile = new File("/Users/venu/work/Java/src/Test.txt");
        File dstfile = new File("/Users/venu/work/Java/src/TestDest.txt");
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel = new FileInputStream(srcfile).getChannel();
            destChannel = new FileOutputStream(dstfile).getChannel();

            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());

            FileChannel fileChannel = new RandomAccessFile(srcfile, "rw").getChannel();

            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 4096 * 8 * 8);
            mappedByteBuffer.put("TestDestNew".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            sourceChannel.close();
            destChannel.close();
        }
    }
}
