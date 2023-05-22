package ss9_dsa_list.extra_exercises.service.impl;

import ss9_dsa_list.extra_exercises.model.Lecturers;
import ss9_dsa_list.extra_exercises.model.Person;
import ss9_dsa_list.extra_exercises.reposiroy.IPersonRepository;
import ss9_dsa_list.extra_exercises.reposiroy.impl.LecturesRepository;
import ss9_dsa_list.extra_exercises.service.IPersonService;

import java.util.List;
import java.util.Scanner;

public class LecturesService implements IPersonService {
    private static Scanner scanner = new Scanner(System.in);
    private static IPersonRepository lecturesRepository = new LecturesRepository();

    @Override
    public void display() {
        List<Person> student = lecturesRepository.getAll();
        for (Person s : student) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhap ma giang vien:");
        String ID = scanner.nextLine();
        System.out.println("Nhap ten giang vien:");
        String name = scanner.nextLine();
        System.out.println("Nhap ngay sinh cua giang vien:");
        String dayOfbirth = scanner.nextLine();
        System.out.println("Nhap gioi tinh giang vien:");
        String gender = scanner.nextLine();
        System.out.println("Nhap chuyen mon cua giang vien");
        String specialize = scanner.nextLine();


        Person lectures = new Lecturers(ID, name, dayOfbirth, gender, specialize);
        lecturesRepository.add(lectures);
        System.out.println("Da them giang vien");

    }

    @Override
    public void delete() {
        System.out.println("Nhap ma giang vien ban muon xoa:");
        String id = scanner.nextLine();
        Person lectures = lecturesRepository.getByID(id);
        if (lectures == null) {
            System.out.println("Khong tim thay giang vien");
        } else {
            System.out.println("ban co chac chan muon xoa giang vien");
            System.out.println("1. chac chan");
            byte choice = Byte.parseByte(scanner.nextLine());
            if (choice == 1) {
                lecturesRepository.remove(lectures);
                System.out.println("Da xoa hoc vien");
            }
        }
    }
}
