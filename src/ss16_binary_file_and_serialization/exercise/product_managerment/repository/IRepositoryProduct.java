package ss16_binary_file_and_serialization.exercise.product_managerment.repository;

import ss16_binary_file_and_serialization.exercise.product_managerment.model.Product;

import java.util.List;

public interface IRepositoryProduct {
    List<Product> getAll();

    void add(Product product);

    List<Product> getByName(String name);
}
