package ss9_dsa_list.extra_exercises.controller;

import ss9_dsa_list.extra_exercises.service.IPersonService;
import ss9_dsa_list.extra_exercises.service.impl.LecturesService;
import ss9_dsa_list.extra_exercises.service.impl.StudentService;

import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static IPersonService studentService = new StudentService();

    private static IPersonService lecturesService = new LecturesService();

    public static void menu() {
        do {
            System.out.println("--------------------------");
            System.out.println("Chọn chức năng theo số(để tiêp tục):");
            System.out.println("1. Thêm mới giảng vien hoặc học viên");
            System.out.println("2. Xoá giảng vien hoặc học viên");
            System.out.println("3. Xem danh sách giảng vien hoặc học viên");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng");
            int choice =0;
            choice = checkChoice(choice);
            switch (choice) {
                case 1:
                    System.out.println("Ban muon them Giang vien hay hoc vien");
                    System.out.println("1. Hoc vien");
                    System.out.println("2. Giang vien");
                    choice = checkChoice(choice);
                    switch (choice) {
                        case 1:
                            studentService.add();
                            break;
                        case 2:
                            lecturesService.add();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Ban muon xoa Giang vien hay hoc vien");
                    System.out.println("1. Hoc vien");
                    System.out.println("2. Giang vien");
                    choice = checkChoice(choice);
                    switch (choice) {
                        case 1:
                            studentService.delete();
                            break;
                        case 2:
                            lecturesService.delete();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Ban muon xem danh sach Giang vien hay hoc vien");
                    System.out.println("1. Hoc vien");
                    System.out.println("2. Giang vien");
                    System.out.println("3. Ca hai");
                    choice = checkChoice(choice);
                    switch (choice) {
                        case 1:
                            studentService.display();
                            break;
                        case 2:
                            lecturesService.display();
                            break;
                        case 3:
                            studentService.display();
                            lecturesService.display();
                            break;
                    }
                    break;
                case 4:
                    System.exit(1);
            }
        } while (true);


    }
    private static int checkChoice(int choice){
        boolean checkChoice ;
        do {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                checkChoice=false;
            }catch (NumberFormatException numberFormatException) {
                System.out.println("vui long nhap so: ");
                checkChoice=true;
            }
        }while (checkChoice);
        return choice;
    }
}
