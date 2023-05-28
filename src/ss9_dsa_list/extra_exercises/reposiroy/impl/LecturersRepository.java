package ss9_dsa_list.extra_exercises.reposiroy.impl;

import ss9_dsa_list.extra_exercises.model.Lecturers;
import ss9_dsa_list.extra_exercises.model.Person;
import ss9_dsa_list.extra_exercises.reposiroy.IPersonRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LecturersRepository implements IPersonRepository {
    private static List<Person> lecturers = new ArrayList<>();

//    static {
//        lecturers.add(new Lecturers("GV-001", "Nguyen Thi A", "11/12/1990", "Nu", "Tester"));
//        lecturers.add(new Lecturers("GV-001", "Nguyen Van d", "21/12/1993", "Nam", "Tester"));
//        lecturers.add(new Lecturers("GV-001", "Nguyen Thi c", "11/1/1995", "Nu", "Tester"));
//    }

    @Override
    public List<Person> getAll() {
        return lecturers;
    }


    @Override
    public void add(Person person) {
        lecturers.add(person);
        putData(lecturers, false);
    }

    @Override
    public Person getByID(String id) {
        for (Person l : lecturers) {
            if (l.getID().equals(id)) {
                return l;
            }
        }
        return null;
    }

    @Override
    public void remove(Person person) {
        lecturers.remove(person);
        putData(lecturers, false);
    }

    @Override
    public List<Person> getData() {
        File file = new File("src/ss9_dsa_list/extra_exercises/data/dataLecturers.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] lt = line.split(",");
                Person lecturer = new Lecturers(lt[0], lt[1], lt[2], lt[3], lt[4]);
                lecturers.add(lecturer);
            }
            br.close();
            fileReader.close();
        } catch (FileNotFoundException f) {
            System.out.println("khong tim thay file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lecturers;
    }

    @Override
    public void putData(List<Person> lecturers, boolean append) {
        try {
            File tagetFile = new File("src/ss9_dsa_list/extra_exercises/data/dataLecturers.csv");
            FileWriter fileWriter = new FileWriter(tagetFile, append);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            for (Person l : lecturers
            ) {
                bw.write("\n" + l.getInfoToReadFile());
            }
            bw.flush();
            bw.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
