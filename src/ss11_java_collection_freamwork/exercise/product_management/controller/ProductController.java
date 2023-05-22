package ss11_java_collection_freamwork.exercise.product_management.controller;

import ss11_java_collection_freamwork.exercise.product_management.service.IProductService;
import ss11_java_collection_freamwork.exercise.product_management.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);

    private static IProductService productService = new ProductService();

    public static void menu() {
        do {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xoá sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("7. Thoát");
            System.out.println("Nhập chức năng theo số:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService.update();
                    break;
                case 3:
                    productService.delete();
                    break;
                case 4:
                    productService.display();
                    break;
                case 5:
                    productService.searchName();
                    break;
                case 6:
                    productService.sortPrice();
                    break;
                case 7:
                    System.exit(1);
            }
        } while (true);
    }
}
