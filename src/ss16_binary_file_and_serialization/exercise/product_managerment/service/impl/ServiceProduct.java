package ss16_binary_file_and_serialization.exercise.product_managerment.service.impl;

import ss16_binary_file_and_serialization.exercise.product_managerment.model.Product;
import ss16_binary_file_and_serialization.exercise.product_managerment.repository.IRepositoryProduct;
import ss16_binary_file_and_serialization.exercise.product_managerment.repository.impl.RepositoryProduct;
import ss16_binary_file_and_serialization.exercise.product_managerment.service.IServiceProduct;

import java.util.List;
import java.util.Scanner;

public class ServiceProduct implements IServiceProduct {
    private static Scanner scanner = new Scanner(System.in);
    private static IRepositoryProduct repositoryProduct = new RepositoryProduct();

    @Override
    public void display() {
        List<Product> productList = repositoryProduct.getAll();
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    //    public Product(String ID, String name, int price, String producer_good, String describe)
    @Override
    public void add() {
        System.out.println("Nhap ID:");
        String id = scanner.nextLine();
        System.out.println("Nhap ten:");
        String name = scanner.nextLine();
        System.out.println("Nhap gia:");
        int price ;
        do {
            try {
                price= Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException n){
                System.out.println("Vui long nhap gia bang so: ");
            }
        }while (true);
        System.out.println("Nhap Hang san xuat:");
        String producerGood = scanner.nextLine();
        System.out.println("Nhap mo ta:");
        String describe = scanner.nextLine();
        Product product = new Product(id, name, price, producerGood, describe);
        repositoryProduct.add(product);
    }

    @Override
    public void search() {
        System.out.println("nhap ten san pham can tim");
        String name = scanner.nextLine();
        List<Product> product = repositoryProduct.getByName(name);
        if (product.size() == 0) {
            System.out.println("Khong tim thay san pham nao");
        } else {
            for (Product p : product) {
                System.out.println(p);
            }
        }
    }
}
