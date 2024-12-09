package hw4.hw4_1;


public class ArrayClass {

    public static void main(String[] args) {

        int[] myArray = {3, 4, 5, 6};
        System.out.println("Cумма массива " + sumArray(myArray) );
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

}
