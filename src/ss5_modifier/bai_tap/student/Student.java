package ss5_modifier.bai_tap.student;

public class Student {
    private String name = "John Wick";
    private String classes = "C03";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    //    private void setName(String name) {
//        this.name = name;
//    }
//void setName(String name) {
//    this.name = name;
//}
//    protected public void setName(String name) {
//        this.name = name;
//    }
    public void setClasses(String classes) {
        this.classes = classes;
    }

    //    void setClasses(String classes) {
//        this.classes = classes;
//    }
//
//    private void setClasses(String classes) {
//        this.classes = classes;
//    }
//
//    protected void setClasses(String classes) {
//        this.classes = classes;
//    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
