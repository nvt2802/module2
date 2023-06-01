package case_study.service.impl;

import case_study.model.person_model.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.repository.impl.EmployeeRepository;
import case_study.service.IEmployeeService;
import case_study.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static final IEmployeeRepository employeeRepository = new EmployeeRepository();
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Employee> employeeList = employeeRepository.getAll();
        for (Employee p : employeeList
        ) {
            System.out.println(p);
        }
    }
    //Employee(String ID, String name, String dayOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String academicLevel, String jobPosition, int salary) {

    @Override
    public void add() {
        String id = null;
        id = Regex.getRegexId(id);
        Employee employee = inputInforEmployee(id);
        employeeRepository.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Enter the employee id that needs to be corrected");
        String id = scanner.nextLine();
        Employee employee = employeeRepository.getByID(id);
        if (employee == null) {
            System.out.println("Can't find this employee");
        } else {
            employee = inputInforEmployee(id);
            employeeRepository.update(employee);
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter the employee id that needs to be delete");
        String id = scanner.nextLine();
        Employee employee = employeeRepository.getByID(id);
        if (employee == null) {
            System.out.println("Can't find this employee");
        } else {
            System.out.println("Are you sure! to delete " + employee.getName());
            System.out.println("1. Yes");
            System.out.println("2. No");
            byte choice = Byte.parseByte(scanner.nextLine());
            if (choice == 1) {
                employeeRepository.delete(employee);
            }
        }
    }

    @Override
    public void search() {
        System.out.println("Input employee name: ");
        String name = scanner.nextLine();
        List<Employee> employee = employeeRepository.getByName(name);
        if (employee == null) {
            System.out.println("Can't find this employee");
        } else {
            for (Employee e : employee) {
                System.out.println(e);
            }
        }
    }

    private static Employee inputInforEmployee(String id) {
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
        String academyLevel = null;
        byte choice;
        do {
            System.out.println("Choice academy level:\n" +
                    "1. Intermediate\n" +
                    "2. College\n" +
                    "3. Undergraduate\n" +
                    "4. Graduate\n");
            choice = Byte.parseByte(scanner.nextLine());


            switch (choice) {
                case 1:
                    academyLevel = "Intermediate";
                    break;
                case 2:
                    academyLevel = "College";
                    break;
                case 3:
                    academyLevel = "Undergraduate";
                    break;
                case 4:
                    academyLevel = "Graduate";
                    break;
            }
        } while (academyLevel == null);
        System.out.println("Input job position:");
        String jobPosition = null;
        do {
            System.out.println("Choice job position:\n" +
                    "1. Receptionist\n" +
                    "2. Waiter\n" +
                    "3. Specialist\n" +
                    "4. Supervisor\n" +
                    "5. Manager\n" +
                    "5. Director\n"
            );
            choice = Byte.parseByte(scanner.nextLine());

            switch (choice) {
                case 1:
                    jobPosition = "Receptionist";
                    break;
                case 2:
                    jobPosition = "Waiter";
                    break;
                case 3:
                    jobPosition = "Specialist";
                    break;
                case 4:
                    jobPosition = "Supervisor";
                    break;
                case 5:
                    jobPosition = "Manager";
                    break;
            }
        } while (jobPosition == null);
        int salary;
        do {
            try {
                System.out.println("Input salary: ");
                salary = Integer.parseInt(scanner.nextLine());
                if (salary > 0) {
                    break;
                } else {
                    System.out.println("Salary must be greater than 0");
                }
            } catch (NumberFormatException n) {
                System.out.println("Not a Number!");
            }
        } while (true);
        return new Employee(id, name, dayOfBirth, gender, identity, phoneNumber, email, academyLevel, jobPosition, salary);
    }
}
