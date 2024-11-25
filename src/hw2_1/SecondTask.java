package hw2_1;

import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Длина:");
        Integer width = console.nextInt();
        System.out.println("Ширина:");
        Integer length = console.nextInt();

        System.out.println("Площадь: " + (width * length));
    }
}
