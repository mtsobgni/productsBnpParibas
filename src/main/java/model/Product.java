package model;

public class Product {

    private Integer id;

    private ProductType name;

    private int qte;

    private double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProductType getName() {
        return name;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(ProductType name) {
        this.name = name;
    }

    public Product(Integer id, ProductType name, int qte, double price) {
        this.id = id;
        this.name = name;
        this.qte = qte;
        this.price = price;
    }
}
