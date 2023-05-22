package ss11_java_collection_freamwork.exercise.product_management.repository.impl;

import ss11_java_collection_freamwork.exercise.product_management.model.Products;
import ss11_java_collection_freamwork.exercise.product_management.repository.IProductRepository;

import java.util.*;

public class ProductRepository implements IProductRepository {
    private static List<Products> products = new ArrayList<>();

    static {
        products.add(new Products("1", "Nuoc Ngot", 10000));
        products.add(new Products("2", "Banh", 20000));
        products.add(new Products("3", "Keo mut", 1000));
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
    public Products getByName(String name) {
        for (Products p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
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
