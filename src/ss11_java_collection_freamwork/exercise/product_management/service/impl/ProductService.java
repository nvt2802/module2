package ss11_java_collection_freamwork.exercise.product_management.service.impl;

import ss11_java_collection_freamwork.exercise.product_management.model.Products;
import ss11_java_collection_freamwork.exercise.product_management.repository.IProductRepository;
import ss11_java_collection_freamwork.exercise.product_management.repository.impl.ProductRepository;
import ss11_java_collection_freamwork.exercise.product_management.service.IProductService;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductRepository productRepository = new ProductRepository();

    @Override
    public void display() {
        List<Products> products = productRepository.getAll();
        for (Products p : products) {
            System.out.println(p);
        }
    }

    @Override
    public void add() {
        Products product = inputProduct();
        productRepository.addProduct(product);
        System.out.println("Them thanh cong");
    }

    @Override
    public void delete() {
        System.out.println("Nhap id san pham ban can xoa");
        String id = scanner.nextLine();
        Products products = productRepository.getByID(id);
        if (products == null) {
            System.out.println("Khong tim thay san pham");
        } else {
            System.out.println("Ban co chac chan muon xoa san pham");
            System.out.println("1. Chac chan");
            byte choice = Byte.parseByte(scanner.nextLine());
            if (choice == 1) {
                productRepository.remove(products);
                System.out.println("Xoa thanh cong");
            }
        }
    }

    @Override
    public void searchName() {
        System.out.println("Nhap ten san pham can tim");
        String name = scanner.nextLine();
        productRepository.getByName(name);
    }

    @Override
    public void update() {
        System.out.println("Nhap ma san pham can sua");
        String id = scanner.nextLine();
        int index = productRepository.getIndexByID(id);
        if (index == -1) {
            System.out.println("Khong tim thay san pham");
        } else {
            Products product = inputProduct();
            productRepository.update(index, product);
        }
    }

    @Override
    public void sortPrice() {
        System.out.println("Ban muon sap xep tang dan hay giam dan");
        System.out.println("1. tang dan");
        System.out.println("2. giam dan");
        byte choice = Byte.parseByte(scanner.nextLine());
        switch (choice) {
            case 1:
                productRepository.sortUpPrice();
                break;
            case 2:
                productRepository.sortDownPrice();
                break;
        }
        display();
    }

    public Products inputProduct() {
        System.out.println("Nhap ma san pham");
        String id = scanner.nextLine();
        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap mo ta san pham");
        String decription = scanner.nextLine();
        return new Products(id, name, price,decription);
    }
}
