package ss9_dsa_list.extra_exercises.model;

public class Person {
    private String ID;
    private String name;
    private String dayOfBirth;
    private String gender;

    public Person(String ID, String name, String dayOfBirth, String gender) {
        this.ID = ID;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
    }

    public Person() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Mã ='" + ID + '\'' +
                ", Tên ='" + name + '\'' +
                ", Ngày sinh='" + dayOfBirth + '\'' +
                ", Giới tính=" + gender;
    }
}
