package hw3.hw3_6;

import java.util.Objects;

public class Item {

    private String name;
    private Double price;
    private Integer id;

    public Item() {

    }

    public Item(String name, Integer id, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
    @Override
    public boolean equals(Object otherClass) {
        if (this == otherClass) return false;
        if (otherClass == null || getClass() != otherClass.getClass()) return false;
        Item item = (Item) otherClass;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }


    @Override
    public String toString() {
        return "Student{" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public Item clone() {
        Item item = new Item();
        item.id = this.id;
        item.name = this.name;
        item.price = this.price;
        return item;
    }
}
