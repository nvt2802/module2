package case_study.repository.impl;

import case_study.model.person_model.Customer;
import case_study.model.person_model.Employee;
import case_study.repository.ICustomerRepository;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String CUSTOMER_LIST_PATH="src/case_study/data/data_customer.csv";
    private static List<Customer> customers = new ArrayList<>();
    @Override
    public List<Customer> getAll() {
        List<String> customerList = ReadAndWriteFile.readFile(CUSTOMER_LIST_PATH);
        customers.clear();
        String[] info;
        for(String str: customerList) {
            info = str.split(",");
            customers.add(new Customer(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8]));
        }
        return customers;
    }
//(String ID, String name, String dayOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String customerLevel, String address) {
//
    @Override
    public void add(Customer customer) {
        List<String> customerList = ReadAndWriteFile.readFile(CUSTOMER_LIST_PATH);
        customerList.add(customer.getID()+","+customer.getName()+","+customer.getDayOfBirth()+","+customer.getIdentityCardNumber()+","+customer.getPhoneNumber()+","+customer.getEmail()+","+customer.getCustomerLevel()+","+customer.getAddress());
        ReadAndWriteFile.writeFile(CUSTOMER_LIST_PATH,customerList,false);
    }

}
