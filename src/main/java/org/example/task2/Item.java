package org.example.task2;

public class Item {

    private long id;
    private String name;
    private double price;

    public Item(long _id, String _name, double _price) {
        this.id = _id;
        this.name = _name;
        this.price = _price;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
}
