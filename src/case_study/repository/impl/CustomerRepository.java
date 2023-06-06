package case_study.repository.impl;

import case_study.model.person_model.Customer;
import case_study.repository.ICustomerRepository;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String CUSTOMER_LIST_PATH = "src/case_study/data/data_customer.csv";
    private static final List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> getAll() {
        List<String> customerList = ReadAndWriteFile.readFile(CUSTOMER_LIST_PATH);
        customers.clear();
        String[] info;
        for (String str : customerList) {
            info = str.split(",");
            customers.add(new Customer(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]));
        }
        return customers;
    }

    //(String ID, String name, String dayOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String customerLevel, String address) {
//
    @Override
    public void add(Customer customer) {
        List<String> customerList = ReadAndWriteFile.readFile(CUSTOMER_LIST_PATH);
        customerList.add(customer.getID() + "," + customer.getName() + "," + customer.getDayOfBirth() + "," + customer.getGender() + "," + customer.getIdentityCardNumber() + "," + customer.getPhoneNumber() + "," + customer.getEmail() + "," + customer.getCustomerLevel() + "," + customer.getAddress());
        ReadAndWriteFile.writeFile(CUSTOMER_LIST_PATH, customerList, false);
    }

    @Override
    public Customer getByID(String id) {
        List<Customer> customerList = getAll();
        for (Customer p : customerList
        ) {
            if (p.getID().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void update(Customer customer) {
        List<Customer> customerList = getAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getID().equals(customer.getID())) {
                customerList.set(i, customer);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Customer p : customerList) {
            stringList.add(p.getID() + "," + p.getName() + "," + p.getDayOfBirth() + "," + p.getGender() + "," + p.getIdentityCardNumber() + "," + p.getPhoneNumber() + "," + p.getEmail() + "," + p.getCustomerLevel() + "," + p.getAddress());
        }
        ReadAndWriteFile.writeFile(CUSTOMER_LIST_PATH, stringList, false);
    }

    @Override
    public void delete(Customer customer) {
        List<Customer> customerList = getAll();
        customerList.remove(customer);
        List<String> stringList = new ArrayList<>();
        for (Customer p : customerList
        ) {
            stringList.add(p.getID() + "," + p.getName() + "," + p.getDayOfBirth() + "," + p.getGender() + "," + p.getIdentityCardNumber() + "," + p.getPhoneNumber() + "," + p.getEmail() + "," + p.getCustomerLevel() + "," + p.getAddress());
        }
        ReadAndWriteFile.writeFile(CUSTOMER_LIST_PATH, stringList, false);
    }

    @Override
    public List<Customer> getByName(String name) {
        List<Customer> customerList = getAll();
        List<Customer> customerNewList = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                customerNewList.add(customerList.get(i));
            }
        }
        return customerNewList;
    }

}
