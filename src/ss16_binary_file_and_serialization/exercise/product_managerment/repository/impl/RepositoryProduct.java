package ss16_binary_file_and_serialization.exercise.product_managerment.repository.impl;

import ss16_binary_file_and_serialization.exercise.product_managerment.common.ProductBinaryFile;
import ss16_binary_file_and_serialization.exercise.product_managerment.model.Product;
import ss16_binary_file_and_serialization.exercise.product_managerment.repository.IRepositoryProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RepositoryProduct implements IRepositoryProduct {
    private static final String PRODUCT_LIST_FILE_PATH = "src/ss16_binary_file_and_serialization/exercise/product_managerment/data/data_product.dat";

    private static List<Product> productList = new ArrayList<>();
    @Override
    public List<Product> getAll() {
        return ProductBinaryFile.readFile(PRODUCT_LIST_FILE_PATH);
    }

    @Override
    public void add(Product product) {
        List<Product> products=ProductBinaryFile.readFile(PRODUCT_LIST_FILE_PATH);
        products.add(product);
        ProductBinaryFile.writeFile(PRODUCT_LIST_FILE_PATH,products);
    }

    @Override
    public List<Product> getByName(String name) {
        List<Product> products = ProductBinaryFile.readFile(PRODUCT_LIST_FILE_PATH);
        List<Product> productsFind = new ArrayList<>();
        for (Product p :products) {
            if(p.getName().toLowerCase().contains(name.toLowerCase())){
                productsFind.add(p);
            }
        }
        return productsFind;
    }


}
