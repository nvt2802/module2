package ss9_dsa_list.extra_exercises.common;

import ss9_dsa_list.extra_exercises.model.Lecturers;
import ss9_dsa_list.extra_exercises.model.Person;

import java.io.*;
import java.util.List;

public class PersonCommon {
    public static List<Person> getData(String path) {
        List<Person> personList=null;
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] lt = line.split(",");
                Person lecturer = new Lecturers(lt[0], lt[1], lt[2], lt[3], lt[4]);
                personList.add(lecturer);
            }
            br.close();
            fileReader.close();
        } catch (FileNotFoundException f) {
            System.out.println("khong tim thay file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return personList;
    }
    public static void putData(List<Person> personList,String path) {
        String str = "";
        try {
            File tagetFile = new File(path);
            FileWriter fileWriter = new FileWriter(tagetFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            for (Person l : personList
            ) {
                str+=l.getInfoToReadFile()+"\n";
            }
            bw.write(str);
            bw.flush();
            bw.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
