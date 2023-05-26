package ss15_io_text_file;

import java.io.*;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        try {
            File fileIn = new File("D:\\CODEGYM\\module2\\src\\ss15_io_text_file\\test.csv");
            FileReader in = new FileReader(fileIn);

            BufferedReader reader = new BufferedReader(in);
            String line = null;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
