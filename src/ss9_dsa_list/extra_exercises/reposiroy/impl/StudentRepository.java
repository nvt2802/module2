package ss9_dsa_list.extra_exercises.reposiroy.impl;

import ss9_dsa_list.extra_exercises.common.PersonCommon;
import ss9_dsa_list.extra_exercises.model.Person;
import ss9_dsa_list.extra_exercises.reposiroy.IPersonRepository;

import java.util.List;

public class StudentRepository implements IPersonRepository {
    private static final String STUDENT_LIST_FILE_PATH = "src/ss9_dsa_list/extra_exercises/data/dataLecturers.csv";

    @Override
    public List<Person> getAll() {
        return PersonCommon.getData(STUDENT_LIST_FILE_PATH);
    }


    @Override
    public void add(Person person) {
        List<Person> studentList = PersonCommon.getData(STUDENT_LIST_FILE_PATH);
        studentList.add(person);
        PersonCommon.putData(studentList, STUDENT_LIST_FILE_PATH);
    }

    @Override
    public Person getByID(String id) {
        List<Person> studentList = PersonCommon.getData(STUDENT_LIST_FILE_PATH);
        for (Person l : studentList) {
            if (l.getID().equals(id)) {
                return l;
            }
        }
        return null;
    }

    @Override
    public void remove(Person person) {
        List<Person> studentList = PersonCommon.getData(STUDENT_LIST_FILE_PATH);
        studentList.remove(person);
        PersonCommon.putData(studentList, STUDENT_LIST_FILE_PATH);
    }
}
