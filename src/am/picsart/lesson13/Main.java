
package am.picsart.lesson13;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isCorrectBuckets("{]"));
    }

    public static boolean isCorrectBuckets(String str) {
        Stack<Character> buckets = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            if (!isBucket(symbol)) {
                continue;
            }

            if (isOpenBucket(symbol)) {
                buckets.add(symbol);
            } else {
                if (buckets.isEmpty() || !isBucketsArePair(symbol, buckets.pop())) {
                    return false;
                }
            }
        }
        return buckets.isEmpty();
    }

    private static boolean isBucketsArePair(char bucket1, char bucket2) {
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

    private static boolean isOpenBucket(char symbol) {
        return symbol == '{' || symbol == '(' || symbol == '[';
    }

    private static boolean isBucket(char symbol) {
        return isOpenBucket(symbol) || symbol == '}' || symbol == ')' || symbol == ']';
    }

}
