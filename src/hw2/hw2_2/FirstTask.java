package hw2.hw2_2;

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число:");
        int value = console.nextInt();


        if ( value % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
    }
}
