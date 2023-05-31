package case_study.service.impl;

import case_study.model.person_model.Employee;
import case_study.model.person_model.Person;
import case_study.repository.IEmployeeRepository;
import case_study.repository.impl.EmployeeRepository;
import case_study.service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static IEmployeeRepository employeeRepository = new EmployeeRepository();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        List<Person> employeeList = employeeRepository.getAll();
        for (Person p:employeeList
             ) {
            System.out.println(p);
        }
    }
    //Employee(String ID, String name, String dayOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String academicLevel, String jobPosition, int salary) {

    @Override
    public void add() {
        System.out.println("Input ID:");
        String id = scanner.nextLine();
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.println("Input day of birth:");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Input gender:");
        String gender = scanner.nextLine();
        System.out.println("Input identity card number: ");
        String identity = scanner.nextLine();
        System.out.println("Input phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Input email:");
        String email = scanner.nextLine();
        System.out.println("Input academy level:");
        String academyLevel = scanner.nextLine();
        System.out.println("Input job position:");
        String jobPosition = scanner.nextLine();
        System.out.println("Input salary: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id,name,dayOfBirth,gender,identity,phoneNumber,email,academyLevel,jobPosition,salary);
        employeeRepository.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Enter the employee id that needs to be corrected");
        String id = scanner.nextLine();
        Employee employee = employeeRepository.getByID(id);
        if(employee == null){
            System.out.println("Can't find this employee");
        }else {
            System.out.println("Input name:");
            String name = scanner.nextLine();
            System.out.println("Input day of birth:");
            String dayOfBirth = scanner.nextLine();
            System.out.println("Input gender:");
            String gender = scanner.nextLine();
            System.out.println("Input identity card number: ");
            String identity = scanner.nextLine();
            System.out.println("Input phone number:");
            String phoneNumber = scanner.nextLine();
            System.out.println("Input email:");
            String email = scanner.nextLine();
            System.out.println("Input academy level:");
            String academyLevel = scanner.nextLine();
            System.out.println("Input job position:");
            String jobPosition = scanner.nextLine();
            System.out.println("Input salary: ");
            int salary = Integer.parseInt(scanner.nextLine());
            employee = new Employee(id,name,dayOfBirth,gender,identity,phoneNumber,email,academyLevel,jobPosition,salary);
            employeeRepository.update(employee);
        }
    }
}
