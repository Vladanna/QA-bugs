package hw3.hw3_3;

public class Item {

    private final String name;
    private Integer price;
    private final Integer quantity;

    public Item(String name, Integer price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void getInfo() {
        System.out.println("Информация о товаре " + this.name + " цена " + this.price + " количество" + this.quantity);
    }

    public void restock(int amount) {
        this.price = this.price + amount;
        System.out.println("На счет добавлено  " + this.price);
        System.out.println("Количетсво товара " + this.quantity);
    }

    public void sell(int amount) {
        if (this.quantity > 0) {
            this.price = this.price - amount;
            System.out.println("Осталось " + this.price);
        } else {
            System.out.println("Нет нужного товара");
        }

    }
}
