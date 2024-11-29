package hw3.hw_4;

public class FirstClass {

    public static void main(String[] args) {
        Persona persona1 = new Persona("John", 30,"female","LA");
        Persona persona2 = new Persona("John", 30,"female","LA");
        Persona persona3 = new Persona("Jane", 30,"female","LA");
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println("Equals: " + persona1.equals(persona2));
        System.out.println("NotEquals: " + persona1.equals(persona3));
        System.out.println("HashCode of person1: " + persona1.hashCode());
        System.out.println("HashCode of person2: " + persona2.hashCode());
        System.out.println("HashCode of person3: " + persona3.hashCode());


    }
}
