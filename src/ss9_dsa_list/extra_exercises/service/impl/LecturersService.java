package ss9_dsa_list.extra_exercises.service.impl;

import ss9_dsa_list.extra_exercises.model.Lecturers;
import ss9_dsa_list.extra_exercises.model.Person;
import ss9_dsa_list.extra_exercises.reposiroy.IPersonRepository;
import ss9_dsa_list.extra_exercises.reposiroy.impl.LecturersRepository;
import ss9_dsa_list.extra_exercises.service.IPersonService;

import java.util.List;
import java.util.Scanner;

public class LecturersService implements IPersonService {
    private static Scanner scanner = new Scanner(System.in);
    private static IPersonRepository lecturesRepository = new LecturersRepository();

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
        String ID;
        do {
            ID = scanner.nextLine();
            if (ID.startsWith("GV-") && ID.length() < 7) {
                break;
            }
            System.out.println("vui long nhap dung dinh dang HV-'XXX':");
        } while (true);
        System.out.println("Nhap ten giang vien:");
        String name = scanner.nextLine();
        System.out.println("Nhap ngay sinh cua giang vien:");
        String dayOfbirth = scanner.nextLine();
        System.out.println("Nhap gioi tinh giang vien:");
        String gender;
        do {
            gender = scanner.nextLine();
            if (gender.equalsIgnoreCase("nam") || gender.equalsIgnoreCase("nu")) {
                break;
            }
            System.out.println("Vui long nhap 'Nam' hoac 'nu'");
        } while (true);
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

    @Override
    public void getData() {
        lecturesRepository.getData();
    }
}
