import java.io.File;

public class FileReadProperties {
    public static void main(String[] args) {
        File file = new File("/Users/venu/work/Java/src/Test.txt");
        if (file.exists()) {
            System.out.println("canRead : "+file.canRead());
            System.out.println("Absolutepath : "+file.getAbsolutePath());
            System.out.println("Name : "+file.getName());
            System.out.println("Path : "+file.getPath());
            System.out.println("TotalSpace : "+file.getTotalSpace());
            System.out.println("FreeSpace : "+file.getFreeSpace());
            System.out.println("LastModified : "+file.lastModified());
            System.out.println("Length : "+file.length());
        }
    }
}
