import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TextFilesRead {
    static AtomicInteger totalCount = new AtomicInteger();

    public static void main(String[] args) throws IOException {
        File folder = new File("/Users/venu/work/Java/src/files");
        File[] files = folder.listFiles();
        StringBuilder sb = new StringBuilder();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (File file:
                files) {
            executorService.submit(new ReadFile(file));
        }
        System.out.println("Total Count for the is "+TextFilesRead.totalCount);
    }
}

class ReadFile implements Runnable{

    File file;

    public ReadFile(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        String line;
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(this.file));
            while((line = reader.readLine()) != null){
                sb.append(line);
            }

            String s = sb.toString();
            String findstr = "hello";
            int lastIndex = 0;
            int count = 0;
            while(lastIndex != -1) {
                lastIndex = s.toLowerCase().indexOf(findstr.toLowerCase(), lastIndex);
                if (lastIndex != -1){
                    count++;
                    lastIndex += findstr.length();
                }
            }
            TextFilesRead.totalCount.getAndAdd(count);
            System.out.println("Count for the "+findstr+" is "+TextFilesRead.totalCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}