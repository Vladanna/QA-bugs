package hw4.hw4_4;


import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {
        String test1 = "([]{})"; // Правильная последовательность
        String test2 = "([)]";   // Неправильная последовательность
        String test3 = "{[()]}"; // Правильная последовательность
        String test4 = "((()))"; // Правильная последовательность
        String test5 = "((()";   // Неправильная последовательность

        System.out.println(test1 + ": " + checkStack(test1)); // true
        System.out.println(test2 + ": " + checkStack(test2)); // false
        System.out.println(test3 + ": " + checkStack(test3)); // true
        System.out.println(test4 + ": " + checkStack(test4)); // true
        System.out.println(test5 + ": " + checkStack(test5)); // false
    }

    public static Boolean checkStack(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
