package ss15_io_text_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    public List<Countries> readFileCSV(String path){
        List<Countries> countriesList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line =null;
            while ((line=br.readLine())!=null){
                String[] country = line.split(",");
                Countries countries = new Countries(Integer.parseInt(country[0]),country[1],country[2]);
                countriesList.add(countries);
            }
            br.close();
            fileReader.close();
        }catch (FileNotFoundException f){
            System.out.println("khong tim thay file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countriesList;
    }
}
