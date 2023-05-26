package ss15_io_text_file.exercise.read_file_csv;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFileCSV read = new ReadFileCSV();

        List<Countries> countriesList = new ArrayList<>(read.readFileCSV("src/ss15_io_text_file/exercise/read_file_csv/countries.csv"));

        for (Countries c: countriesList
             ) {
            System.out.println(c.readCountriesListFromFile());
        }

    }
}
