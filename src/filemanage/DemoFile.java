package filemanage;

import java.io.File;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args) {
        File fileio=new File("filedemo.txt");
        if(!fileio.exists()){
            try {
                fileio.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(fileio.length());
        System.out.println(fileio.canRead());
        System.out.println(fileio.canWrite());
        System.out.println(fileio.getAbsolutePath());
        System.out.println(fileio.isFile());
        System.out.println(fileio.isDirectory());
    }
}
