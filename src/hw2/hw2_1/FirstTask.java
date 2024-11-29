package hw2.hw2_1;

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer firstValue = console.nextInt();
        Integer secondValue = console.nextInt();

        System.out.println("Cумма: " + (firstValue + secondValue));
        System.out.println("Разность: " + (firstValue - secondValue));
    }
}
