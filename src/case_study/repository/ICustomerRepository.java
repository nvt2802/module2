package case_study.repository;

import case_study.model.person_model.Customer;

import java.util.List;

public interface ICustomerRepository extends Repository<Customer> {
    Customer getByID(String id);

    void update(Customer customer);

    void delete(Customer customer);

    List<Customer> getByName(String name);
    void add(Customer customer);
}
