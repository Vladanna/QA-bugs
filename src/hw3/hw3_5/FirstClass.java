package hw3.hw3_5;

public class FirstClass {

    public static void main(String[] args) {
        Student student1 = new Student("Lisa",2,3.6);
        Student student2 = new Student("Andrey",4,3.8);
        Student student3 = new Student("Mike",4,5.0);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println("Equals: " + student1.equals(student2));
        System.out.println("NotEquals: " + student2.equals(student3));
        System.out.println("HashCode of person1: " + student1.hashCode());
        System.out.println("HashCode of person2: " + student2.hashCode());
        System.out.println("HashCode of person3: " + student3.hashCode());
        Student student4 = student3.clone();
        System.out.println(student4);



    }
}
