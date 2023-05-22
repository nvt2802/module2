package ss9_dsa_list.extra_exercises.reposiroy.impl;

import ss9_dsa_list.extra_exercises.model.Lecturers;
import ss9_dsa_list.extra_exercises.model.Person;
import ss9_dsa_list.extra_exercises.reposiroy.IPersonRepository;
import ss9_dsa_list.extra_exercises.service.IPersonService;

import java.util.ArrayList;
import java.util.List;

public class LecturesRepository implements IPersonRepository {
    private static List<Person> lecturers = new ArrayList<>();

    static {
        lecturers.add(new Lecturers("GV-001", "Nguyen Thi A", "11/12/1990", "Nu", "Tester"));
        lecturers.add(new Lecturers("GV-001", "Nguyen Van d", "21/12/1993", "Nam", "Tester"));
        lecturers.add(new Lecturers("GV-001", "Nguyen Thi c", "11/1/1995", "Nu", "Tester"));
    }

    @Override
    public List<Person> getAll() {
        return lecturers;
    }


    @Override
    public void add(Person person) {
        lecturers.add(person);
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
    }
}
