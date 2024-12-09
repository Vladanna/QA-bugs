package hw4.hw4_3;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println("Список без четных чисел " + deleteCount(arr));
    }

    public static List<Integer> deleteCount(List<Integer> listFull) {
        for (int i = 0; i < listFull.size(); i++) {
            if (listFull.get(i) % 2 == 0) {
                listFull.remove(i);
            }
        }

        return listFull;
    }
}
