package hw3_6;

public class FirstClass {

    public static void main(String[] args) {
        Item item1 = new Item("Shapmoo",2,3.6);
        Item item2 = new Item("Conditioner",4,3.8);
        Item item3 = new Item("Soap",4,5.0);
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println("Equals: " + item1.equals(item2));
        System.out.println("NotEquals: " + item2.equals(item3));
        System.out.println("HashCode of person1: " + item1.hashCode());
        System.out.println("HashCode of person2: " + item2.hashCode());
        System.out.println("HashCode of person3: " + item3.hashCode());
        Item item4 = item3.clone();
        System.out.println(item4);



    }
}
