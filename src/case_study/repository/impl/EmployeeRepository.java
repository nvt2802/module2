package case_study.repository.impl;

import case_study.model.person_model.Employee;
import case_study.model.person_model.Person;
import case_study.repository.IEmployeeRepository;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static String EMPLOYEE_LIST_PATH="src/case_study/data/data_employee.csv";
    private static List<Person> employees = new ArrayList<>();
    //Employee(String ID, String name, String dayOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String academicLevel, String jobPosition, int salary) {

    @Override
    public void add(Employee employee) {
        List<String> employeeList = ReadAndWriteFile.readFile(EMPLOYEE_LIST_PATH);
        employeeList.add(employee.getID()+","+employee.getName()+","+employee.getDayOfBirth()+","+employee.getGender()+","+employee.getIdentityCardNumber()+","+employee.getPhoneNumber()+","+employee.getEmail()+","+employee.getAcademicLevel()+","+employee.getJobPosition()+","+employee.getSalary());
        ReadAndWriteFile.writeFile(EMPLOYEE_LIST_PATH,employeeList,false);
    }

    @Override
    public List<Person> getAll() {
        List<String> employeeList = ReadAndWriteFile.readFile(EMPLOYEE_LIST_PATH);
        employees.clear();
        String[] info;
        for(String str: employeeList) {
            info = str.split(",");
            employees.add(new Employee(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8],Integer.parseInt(info[9])));
        }
        return employees;
    }

    @Override
    public Employee getByID(String id) {
        List<Person> employeeList = getAll();
        for (Person p:employeeList
             ) {
            if(p.getID().equals(id)){
                return (Employee) p;
            }
        }
        return null;
    }

    @Override
    public void update(Employee employee) {
        List<Person> employeeList = getAll();
        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i).getID().equals(employee.getID())){
                employeeList.set(i, employee);
            }
        }
        List<String> stringList = null;
        for (Person p :employeeList
             ) {
            stringList.add(p.getID()+","+p.getName()+","+p.getDayOfBirth()+","+p.getGender()+","+p.getIdentityCardNumber()+","+p.getPhoneNumber()+","+p.getEmail()+","+p.getAcademicLevel()+","+p.getJobPosition()+","+p.getSalary());
        }
        ReadAndWriteFile.writeFile(EMPLOYEE_LIST_PATH,stringList,false);
    }
}
