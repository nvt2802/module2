package ss9_dsa_list.extra_exercises.reposiroy.impl;

import ss9_dsa_list.extra_exercises.model.Lecturers;
import ss9_dsa_list.extra_exercises.model.Person;
import ss9_dsa_list.extra_exercises.model.Student;
import ss9_dsa_list.extra_exercises.reposiroy.IPersonRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IPersonRepository {
    //    public Student(String ID, String name, String dayOfBirth, boolean gender, String classes, short scores)
    private static List<Person> students = new ArrayList<>();


//    static {
//        students.add(new Student("HV-001", "Nguyen Van A", "22/12/2002", "Nam", "C0323G1", 100));
//        students.add(new Student("HV-002", "Nguyen Van B", "23/2/2002", "Nu", "C0523G1", 70));
//        students.add(new Student("HV-003", "Nguyen Van C", "12/3/2002", "Nam", "C1323G1", 30));
//    }

    @Override
    public List<Person> getAll() {
        return students;
    }

    @Override
    public void add(Person student) {
        students.add(student);
        putData(students, false);
    }

    @Override
    public Person getByID(String id) {
        for (Person student : students) {
            if (student.getID().equals(id)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void remove(Person student) {
        students.remove(student);
        putData(students, false);
    }

    @Override
    public List<Person> getData() {
        File file = new File("src/ss9_dsa_list/extra_exercises/data/dataStudent.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] lt = line.split(",");
                Person student = new Student(lt[0], lt[1], lt[2], lt[3], lt[4], Integer.parseInt(lt[5]));
                students.add(student);
            }
            br.close();
            fileReader.close();
        } catch (FileNotFoundException f) {
            System.out.println("khong tim thay file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return students;
    }

    @Override
    public void putData(List<Person> students, boolean append) {

        try {
            File tagetFile = new File("src/ss9_dsa_list/extra_exercises/data/dataStudent.csv");
            FileWriter fileWriter = new FileWriter(tagetFile, append);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            for (Person s : students
            ) {
                bw.write(s.getInfoToReadFile() + "\n");
            }
            bw.flush();
            bw.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
