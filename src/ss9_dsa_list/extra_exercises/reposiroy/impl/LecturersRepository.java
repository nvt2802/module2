package ss9_dsa_list.extra_exercises.reposiroy.impl;

import ss9_dsa_list.extra_exercises.common.PersonCommon;
import ss9_dsa_list.extra_exercises.model.Lecturers;
import ss9_dsa_list.extra_exercises.model.Person;
import ss9_dsa_list.extra_exercises.reposiroy.IPersonRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LecturersRepository implements IPersonRepository {
    private static final String LECTURERS_LIST_FILE_PATH = "src/ss9_dsa_list/extra_exercises/data/dataLecturers.csv";

    @Override
    public List<Person> getAll() {
        return PersonCommon.getData(LECTURERS_LIST_FILE_PATH);
    }


    @Override
    public void add(Person person) {
        List<Person> lecturersList = PersonCommon.getData(LECTURERS_LIST_FILE_PATH);
        lecturersList.add(person);
        PersonCommon.putData(lecturersList,LECTURERS_LIST_FILE_PATH);
    }

    @Override
    public Person getByID(String id) {
        List<Person> lecturersList = PersonCommon.getData(LECTURERS_LIST_FILE_PATH);
        for (Person l : lecturersList) {
            if (l.getID().equals(id)) {
                return l;
            }
        }
        return null;
    }

    @Override
    public void remove(Person person) {
        List<Person> lecturersList = PersonCommon.getData(LECTURERS_LIST_FILE_PATH);
        lecturersList.remove(person);
        PersonCommon.putData(lecturersList, LECTURERS_LIST_FILE_PATH);
    }
}

