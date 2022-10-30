package ss17_serialization.exercise.product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable {

    private int id;
    private String product;
    private String productCompany;
    private int price;

    public Product() {
    }

    public Product(int id, String product, String productCompany, int price) {
        this.id = id;
        this.product = product;
        this.productCompany = productCompany;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", productCompany='" + productCompany + '\'' +
                ", price=" + price +
                '}';
    }
}
