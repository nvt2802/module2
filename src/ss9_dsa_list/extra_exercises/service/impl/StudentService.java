package ss9_dsa_list.extra_exercises.service.impl;

import ss9_dsa_list.extra_exercises.model.Person;
import ss9_dsa_list.extra_exercises.model.Student;
import ss9_dsa_list.extra_exercises.reposiroy.IPersonRepository;
import ss9_dsa_list.extra_exercises.reposiroy.impl.StudenRepository;
import ss9_dsa_list.extra_exercises.service.IPersonService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IPersonService {

    private static Scanner scanner = new Scanner(System.in);
    private static IPersonRepository studentRepository = new StudenRepository();

    @Override
    public void display() {
        List<Person> student = studentRepository.getAll();
        for (Person s : student) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhap ma hoc vien:");
        String ID = scanner.nextLine();
        System.out.println("Nhap ten hoc vien:");
        String name = scanner.nextLine();
        System.out.println("Nhap ngay sinh cua hoc vien:");
        String dayOfbirth = scanner.nextLine();
        System.out.println("Nhap gioi tinh hoc vien:");
        String gender = scanner.nextLine();
        System.out.println("Nhap lop cua hoc vien");
        String classes = scanner.nextLine();
        System.out.println("Nhap diem cua hoc vien");
        int scores = Integer.parseInt(scanner.nextLine());

        Person student = new Student(ID, name, dayOfbirth, gender, classes, scores);
        studentRepository.add(student);
        System.out.println("Da them hoc vien");

    }

    @Override
    public void delete() {
        System.out.println("Nhap ma hoc vien ban muon xoa:");
        String id = scanner.nextLine();
        Person student = studentRepository.getByID(id);
        if (student == null) {
            System.out.println("Khong tim thay hoc vien");
        } else {
            System.out.println("ban co chac chan muon xoa hoc vien");
            System.out.println("1. chac chan");
            byte choice = Byte.parseByte(scanner.nextLine());
            if (choice == 1) {
                studentRepository.remove(student);
                System.out.println("Da xoa hoc vien");
            }
        }
    }
}
