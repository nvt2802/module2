package case_study.model.person_model;

public class Employee extends Person{
    private String academicLevel;
    private String jobPosition;
    private int salary;
    public Employee() {
    }
    public Employee(String ID, String name, String dayOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String academicLevel, String jobPosition, int salary) {
        super(ID, name, dayOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.academicLevel = academicLevel;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                ", academicLevel='" + academicLevel + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", salary=" + salary +
                '}';
    }
}
