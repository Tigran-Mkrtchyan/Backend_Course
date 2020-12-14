
package am.picsart.lesson13;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isCorrectBracket("{]"));
    }

    public static boolean isCorrectBracket(String str) {
        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            if (!isBracket(symbol)) {
                continue;
            }

            if (isOpenBracket(symbol)) {
                brackets.add(symbol);
            } else {
                if (brackets.isEmpty() || !isBracketArePair(symbol, brackets.pop())) {
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }

    private static boolean isBracketArePair(char bucket1, char bucket2) {
        switch (bucket1) {
            case '}':
                if (bucket2 == '{') {
                    return true;
                }
                break;
            case ')':
                if (bucket2 == '(') {
                    return true;
                }
                break;
            case ']':
                if (bucket2 == '[') {
                    return true;
                }
                break;
        }
        return false;
    }

    private static boolean isOpenBracket(char symbol) {
        return symbol == '{' || symbol == '(' || symbol == '[';
    }

    private static boolean isBracket(char symbol) {
        return isOpenBracket(symbol) || symbol == '}' || symbol == ')' || symbol == ']';
    }

}
