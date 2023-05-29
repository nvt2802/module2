package ss16_binary_file_and_serialization.exercise.product_managerment.controller;



import ss16_binary_file_and_serialization.exercise.product_managerment.service.IServiceProduct;
import ss16_binary_file_and_serialization.exercise.product_managerment.service.impl.ServiceProduct;

import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);

    private static IServiceProduct productService = new ServiceProduct();
    public static void menu(){


        do {
            System.out.println("0. Thoat");
            System.out.println("1. Them san pham");
            System.out.println("2. Hien thi san pham");
            System.out.println("3. Tim kiem san pham");
            System.out.println("Nhap so de thuc hien chuc nang:");
            byte choice ;
            do {
                try {
                    choice= Byte.parseByte(scanner.nextLine());
                    break;
                }catch (NumberFormatException n){
                    System.out.println("vui long nhap lua chon bang so: ");
                }
            }while (true);

            switch (choice) {
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService.display();
                    break;
                case 3:
                    productService.search();
                    break;
                case 0:
                    System.exit(1);
            }
        }while (true);
    }
}
