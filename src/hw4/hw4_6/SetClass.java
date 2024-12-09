package hw4.hw4_6;

import java.util.HashSet;

public class SetClass {

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 2, 1, 4, 5};
        System.out.println("Количество уникальных элементов " + checkUnique(myArray) );

    }


    public static Integer checkUnique(int[] arr) {
        HashSet<Integer> sets = new HashSet<>();

        for(Integer item : arr) {
            sets.add(item);
        }
        return sets.size();
    }
}
