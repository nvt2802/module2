package ss11_java_collection_freamwork.exercise.product_management.repository;

import ss11_java_collection_freamwork.exercise.product_management.model.Products;

import java.util.List;

public interface IProductRepository {
    List<Products> getAll();

    void addProduct(Products product);

    Products getByID(String id);

    void remove(Products product);

    void getByName(String name);

    void sortUpPrice();

    int getIndexByID(String id);


    void update(int index, Products products);

    void sortDownPrice();
}
