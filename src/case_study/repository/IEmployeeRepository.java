package case_study.repository;

import case_study.model.person_model.Employee;
import case_study.model.person_model.Person;

import java.util.List;

public interface IEmployeeRepository extends Repository{
    void add(Employee employee);

    List<Person> getAll();

    Employee getByID(String id);

    void update(Employee employee);
}
