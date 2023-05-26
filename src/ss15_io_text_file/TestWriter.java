package ss15_io_text_file;

import java.io.File;
import java.io.FileWriter;

public class TestWriter {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("D:\\CODEGYM\\module2\\src\\ss15_io_text_file\\test.csv");
            fileWriter.write("Hello");
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
