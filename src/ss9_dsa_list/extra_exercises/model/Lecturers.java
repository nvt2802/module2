package ss9_dsa_list.extra_exercises.model;

public class Lecturers extends Person{
    private String specialize;

    public Lecturers(String ID, String name, String dayOfBirth, String gender, String specialize) {
        super(ID, name, dayOfBirth, gender);
        this.specialize = specialize;
    }

    public Lecturers(String specialize) {
        this.specialize = specialize;
    }

    public Lecturers(){}

    public String getSpecialize() {
        return specialize;
    }
    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Giảng viên :" +
                super.toString()+
                ", Chuyên môn= " + specialize + '\''
                ;
    }
}
