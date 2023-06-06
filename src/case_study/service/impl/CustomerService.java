package case_study.service.impl;

import case_study.model.person_model.Customer;
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
        for (Customer c : customers
        ) {
            System.out.println(c);
        }

    }

    @Override
    public void add() {
        boolean check;
        String id = null;
        do {
            check = false;
            id = Regex.getRegexCustomerId(id);
            List<Customer> customerList = customerRepository.getAll();
            for (Customer c : customerList
            ) {
                if (c.getID().equals(id)) {
                    System.out.println("ID already exists");
                    check = true;
                    break;
                }
            }
        } while (check);
        Customer customer = inputInfoCustomer(id);
        customerRepository.add(customer);
    }

    @Override
    public void edit() {
        System.out.println("Enter the customer id that needs to be corrected");
        String id = scanner.nextLine();
        Customer customer = customerRepository.getByID(id);
        if (customer == null) {
            System.out.println("Can't find this customer");
        } else {
            customer = inputInfoCustomer(id);
            customerRepository.update(customer);
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter the employee id that needs to be delete");
        String id = scanner.nextLine();
        Customer customer = customerRepository.getByID(id);
        if (customer == null) {
            System.out.println("Can't find this employee");
        } else {
            System.out.println("Are you sure! to delete " + customer.getName());
            System.out.println("1. Yes");
            System.out.println("2. No");
            byte choice = Byte.parseByte(scanner.nextLine());
            if (choice == 1) {
                customerRepository.delete(customer);
            }
        }
    }

    @Override
    public void search() {
        System.out.println("Input employee name: ");
        String name = scanner.nextLine();
        List<Customer> customers = customerRepository.getByName(name);
        if (customers == null) {
            System.out.println("Can't find this employee");
        } else {
            for (Customer e : customers) {
                System.out.println(e);
            }
        }
    }

    private static Customer inputInfoCustomer(String id) {
        String name = null;
        name = Regex.getRegexName(name);
        String dayOfBirth = null;
        dayOfBirth = Regex.getRegexDate(dayOfBirth);
        String gender = null;
        gender = Regex.getRegexGender(gender);
        String identity = null;
        identity = Regex.getRegexIdentity(identity);
        String phoneNumber = null;
        phoneNumber = Regex.getRegexPhoneNumber(phoneNumber);
        String email = null;
        email = Regex.getRegexEmail(email);
        String customerLevel = null;
        do {
            System.out.println("Customer Level:\n" +
                    "1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member");
            byte choice = Byte.parseByte(scanner.nextLine());
            switch (choice) {
                case 1:
                    customerLevel = "Diamond";
                    break;
                case 2:
                    customerLevel = "Platinum";
                    break;
                case 3:
                    customerLevel = "Gold";
                    break;
                case 4:
                    customerLevel = "Silver";
                    break;
                case 5:
                    customerLevel = "Member";
                    break;
                default:
                    System.out.println("Not a level! please re-input:");
            }
        } while (customerLevel == null);
        System.out.println("Input address: ");
        String address = scanner.nextLine();
        return new Customer(id, name, dayOfBirth, gender, identity, phoneNumber, email, customerLevel, address);
    }
    //  (String ID, String name, String dayOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String customerLevel, String address) {

}
