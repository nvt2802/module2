package ss9_dsa_list.extra_exercises.reposiroy.impl;

import ss9_dsa_list.extra_exercises.model.Person;
import ss9_dsa_list.extra_exercises.model.Student;
import ss9_dsa_list.extra_exercises.reposiroy.IPersonRepository;

import java.util.ArrayList;
import java.util.List;

public class StudenRepository implements IPersonRepository {
    //    public Student(String ID, String name, String dayOfBirth, boolean gender, String classes, short scores)
    private static List<Person> students = new ArrayList<>();
    private static List<Person> lecturers = new ArrayList<>();

    static {
        students.add(new Student("HV-001", "Nguyen Van A", "22/12/2002", "Nam", "C0323G1", 100));
        students.add(new Student("HV-002", "Nguyen Van B", "23/2/2002", "Nu", "C0523G1", 70));
        students.add(new Student("HV-003", "Nguyen Van C", "12/3/2002", "Nam", "C1323G1", 30));
    }

    @Override
    public List<Person> getAllStudent() {
        return students;
    }

    @Override
    public List<Person> getAllSLecturers() {
        return null;
    }

    @Override
    public void add(Person student) {
        students.add(student);
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
    }
}
