package ss9_dsa_list.extra_exercises.model;

public class Student extends Person {
    private String classes;
    private int scores;

    public Student(String ID, String name, String dayOfBirth, String gender, String classes, int scores) {
        super(ID, name, dayOfBirth, gender);
        this.classes = classes;
        this.scores = scores;
    }

    public Student(String classes, int scores) {
        this.classes = classes;
        this.scores = scores;
    }

    public Student() {
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Học viên: " +
                super.toString() +
                ", Lớp=" + classes + '\'' +
                ", Điểm số=" + scores;
    }
}
