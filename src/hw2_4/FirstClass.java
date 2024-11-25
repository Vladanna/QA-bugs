package hw2_4;

import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("M:");
        int valueM = console.nextInt();
        System.out.println("N:");
        int valueN = console.nextInt();

        for (int i = 0; i < valueN; i++) {
            for (int j = 0; j < valueM; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
