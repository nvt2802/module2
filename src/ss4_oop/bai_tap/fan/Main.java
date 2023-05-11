package ss4_oop.bai_tap.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(3,true,10,"yellow");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}
