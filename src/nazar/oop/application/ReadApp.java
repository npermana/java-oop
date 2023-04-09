package nazar.oop.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
        // demo manual close
        System.out.println("Demo manual close Buffered reader");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Readme.md"));
            while (true){
                String text = reader.readLine();
                if(text == null)
                    break;
                System.out.println(text);
            }
        }catch (Throwable throwable){
            System.out.println("Error membaca file " + throwable.getMessage());
        }finally {
            if(reader != null) {
                try {
                    reader.close();
                    System.out.println("Sukses menutup");
                }catch (IOException e){
                    System.out.println("Error menutup reader" + e.getMessage());
                }
            }
        }
        System.out.println("Demo autocloseable Buffered reader");

        // demo try with resource sejak java 7
        // memanfaatkan fitur closeable interface dari class BufferedReader
        try(BufferedReader reader1 = new BufferedReader(new FileReader("Readme.mde"))){
            while (true){
                String text = reader1.readLine();
                if(text == null)
                    break;
                System.out.println(text);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
