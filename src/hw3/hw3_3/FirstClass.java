package hw3.hw3_3;

public class FirstClass {

    public static void main(String[] args) {
        Item item = new Item("Шампунь", 4,3);
        item.getInfo();
        item.sell(5);
        item.restock(4);

    }
}
