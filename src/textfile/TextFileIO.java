package textfile;

import java.io.*;

public class TextFileIO {
    public static  void readFile(String path){
        File file=new File(path);
        FileReader fileReader=null;
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            try {
                fileReader=new FileReader(file);
                int i;
                while((i=fileReader.read())!=-1)
                    System.out.println((char)i);

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void readTextFile(String path) {
        File file=new File(path);
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            try {
                fileReader=new FileReader(file);
                bufferedReader=new BufferedReader(fileReader);

                String line;
                while((line=bufferedReader.readLine())!=null)
                    System.out.println(line);

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        TextFileIO textFileIO=new TextFileIO();
        textFileIO.readFile("filedemo.txt");
        textFileIO.readTextFile("filedemo.txt");
    }
}
