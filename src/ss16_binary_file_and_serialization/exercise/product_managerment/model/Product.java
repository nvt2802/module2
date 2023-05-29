package ss16_binary_file_and_serialization.exercise.product_managerment.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String ID ;
    private String name;
    private int price;
    private String producerGood;
    private String describe;

    public Product(String ID, String name, int price, String producerGood, String describe) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.producerGood = producerGood;
        this.describe = describe;
    }

    public Product() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProducerGood() {
        return producerGood;
    }

    public void setProducerGood(String producerGood) {
        this.producerGood = producerGood;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", producer_good='" + producerGood + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
