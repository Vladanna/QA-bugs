package hw4.hw4_2;


public class StringClass {

    public static void main(String[] args) {

        String str = "Червяк ползет по зеленой траве";
        System.out.println("В обратном порядке " + strBack(str));
    }

    public static String strBack(String string) {
        return new StringBuilder(string).reverse().toString();
    }

}
