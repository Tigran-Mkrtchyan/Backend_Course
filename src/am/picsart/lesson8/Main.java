package am.picsart.lesson8;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[]{2, 3, 4, 6};
        System.out.println(getSecondMaxValue(num));
        String a = "s/ banc";
        System.out.println(isContainRepeatedASCIISymbol(a));
    }

    public static int sum(int a, int b) {
        if (a > 0) {
            if (Integer.MAX_VALUE - a < b) {
                throw new IllegalArgumentException("sum does not fit in the int ");
            }
        } else {
            if (Integer.MIN_VALUE - a > b) {
                throw new IllegalArgumentException("sum does not fit in the int ");
            }
        }
        return a + b;
    }

    public static int getSecondMaxValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        int max = arr[0];
        int secondMax = arr[1];
        if (arr[1] > arr[0]) {
            max = secondMax;
            secondMax = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > secondMax) {
                if (arr[i] < max) {
                    secondMax = arr[i];
                } else {
                    secondMax = max;
                    max = arr[i];
                }
            }
        }
        return secondMax;
    }

    public static boolean isContainRepeatedASCIISymbol(String s) {
        int[] arr = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (arr[symbol] == 1) {
                return true;
            }
            arr[symbol] = 1;
        }
        return false;
    }
}
