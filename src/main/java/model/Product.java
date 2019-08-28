package model;

public class Product {

    private ProductType name;

    private int qte;

    private double price;

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

    public Product( ProductType name, int qte) {
        this.name = name;
        this.qte = qte;
    }
}
