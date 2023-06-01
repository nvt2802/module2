package case_study.repository;

import case_study.model.person_model.Person;

import java.util.List;

public interface Repository<T> {
    List<T> getAll();
    void add(T object);
}
