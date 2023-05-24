package ss11_java_collection_freamwork.exercise.product_management.repository.impl;

import ss11_java_collection_freamwork.exercise.product_management.model.Products;
import ss11_java_collection_freamwork.exercise.product_management.repository.IProductRepository;

import java.util.*;

public class ProductRepository implements IProductRepository {
    private static List<Products> products = new ArrayList<>();

    static {
        products.add(new Products("1", "Nuoc Ngot", 10000,"nuoc sieu ngot"));
        products.add(new Products("2", "Banh", 20000,"Banh hoi do"));
        products.add(new Products("3", "Keo mut", 3000,"Keo sieu ngon"));
        products.add(new Products("4", "Cafe", 15000,"Cafe sieu dang"));
        products.add(new Products("5", "Keo deo", 5000,"Keo sieu deo"));
    }


    @Override
    public List<Products> getAll() {
        return products;
    }

    @Override
    public void addProduct(Products product) {
        products.add(product);
    }

    @Override
    public Products getByID(String id) {
        for (Products p : products) {
            if (p.getID().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void remove(Products product) {
        products.remove(product);
    }

    @Override
    public void getByName(String name) {
        boolean check = false;
        for (Products p : products) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(p);
                check=true;
            }
        }
        if (!check){
            System.out.println("khong tim thay san pham nao cung ten");
        }
    }

    @Override
    public void sortUpPrice() {
        products.sort(new Comparator<Products>() {
            @Override
            public int compare(Products o1, Products o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

    }

    @Override
    public int getIndexByID(String id) {
        for (Products p : products) {
            if (p.getID().equals(id)) {
                return products.indexOf(p);
            }
        }
        return -1;
    }

    @Override
    public void update(int index, Products product) {
        products.set(index, product);
    }

    @Override
    public void sortDownPrice() {
        products.sort(new Comparator<Products>() {
            @Override
            public int compare(Products o1, Products o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
    }


}
