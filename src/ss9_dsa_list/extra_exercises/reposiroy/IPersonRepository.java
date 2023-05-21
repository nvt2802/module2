package ss9_dsa_list.extra_exercises.reposiroy;

import ss9_dsa_list.extra_exercises.model.Person;

import java.util.List;

public interface IPersonRepository {
    List<Person> getAllStudent();
    List<Person> getAllSLecturers();

    void add(Person person);

    Person getByID(String id);

    void remove(Person person);
}
