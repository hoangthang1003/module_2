package ss12_tree_map.exercise.ex1;


import ss10_dsa.exercise.LinkedList.MyLinkedList;

public class Product {
    protected static MyLinkedList<Object> product;
    private int id;
    private String name;
    private double price;

    public Product() {
    }
    public Product(String name) {
        this.name = name;
    }
    public Product(String name, double price) {
        this.name= name;
        this.price = price;
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
