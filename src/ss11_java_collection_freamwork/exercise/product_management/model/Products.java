package ss11_java_collection_freamwork.exercise.product_management.model;

import java.util.Objects;

public class Products {
    private String ID;
    private String name;
    private int price;

    public Products(String ID, String name, int price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public Products() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(ID, products.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return "Ma san pham='" + ID + '\'' +
                ", Ten san pham='" + name + '\'' +
                ", Gia=" + price;
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


}
