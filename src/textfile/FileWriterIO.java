package textfile;


import java.io.File;
import java.io.IOException;
import  java.io.FileWriter;
public class FileWriterIO {
    public static void writeFile(String path,String string){
        File file=new File(path);
        FileWriter fileWriter=null;
        if(!file.exists()){
            try {
                file.createNewFile();
                fileWriter=new FileWriter(file,true);
                fileWriter.write(string);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fileWriter=new FileWriter(file,true);
            fileWriter.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    public static void main(String[] args) {
        FileWriterIO fileWriterIO=new FileWriterIO();
        fileWriterIO.writeFile("tambiet.txt","tam biet");
    }
}
