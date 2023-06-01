package case_study.service.impl;

import case_study.model.person_model.Customer;
import case_study.model.person_model.Employee;
import case_study.repository.ICustomerRepository;
import case_study.repository.impl.CustomerRepository;
import case_study.service.ICustomerService;
import case_study.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public void display() {
        List<Customer> customers = customerRepository.getAll();
        for (Customer c:customers
             ) {
            System.out.println(c);
        }

    }

    @Override
    public void add() {
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }
//    private static Customer inputInforEmployee(String id) {
////        String name = null;
////        name = Regex.getRegexName(name);
////        String dayOfBirth = null;
////        dayOfBirth = Regex.getRegexDate(dayOfBirth);
////        String gender = null;
////        gender = Regex.getRegexGender(gender);
////        String identity = null;
////        identity = Regex.getRegexIdentity(identity);
////        String phoneNumber = null;
////        phoneNumber = Regex.getRegexPhoneNumber(phoneNumber);
////        String email = null;
////        email = Regex.getRegexEmail(email);
////        return new Customer(id, name, dayOfBirth, gender, identity, phoneNumber, email);
//    }
    //(String ID, String name, String dayOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String customerLevel, String address) {
//
}
