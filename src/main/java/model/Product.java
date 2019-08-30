package model;

import java.util.Objects;

public class Product {

    private long id;

    private String name;

    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, price);
    }

    public long getId() {
        return id;

    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product( long id,String name, double price) {
        this.id= id;
        this.name = name;
        this.price = price;
    }
}
