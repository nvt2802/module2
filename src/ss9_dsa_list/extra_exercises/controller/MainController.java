package ss9_dsa_list.extra_exercises.controller;

import ss9_dsa_list.extra_exercises.service.IStudentService;
import ss9_dsa_list.extra_exercises.service.impl.StudentService;

import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static IStudentService studentService = new StudentService();
    public static void menu(){
        do{
            System.out.println("--------------------------");
        System.out.println("Chọn chức năng theo số(để tiêp tục):");
        System.out.println("1. Thêm mới học viên");
        System.out.println("2. Xoá học viên");
        System.out.println("3. Xem danh sách học viên");
        System.out.println("4. Thoát");
        System.out.println("Chọn chức năng");
        int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.deleteStudent();
                    break;
                case 3:
                    studentService.displayStudent();
                    break;
                case 4:
                    System.exit(1);
            }
        }while (true);


    }
}
