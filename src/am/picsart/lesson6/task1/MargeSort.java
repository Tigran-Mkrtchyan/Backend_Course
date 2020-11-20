package am.picsart.lesson6.task1;

import java.util.Scanner;

public class MargeSort {
    private static void margeSort(int[] arr) {
        margeSort(arr, 0, arr.length - 1);
    }

    private static void margeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        margeSort(arr, start, mid);
        margeSort(arr, mid + 1, end);
        marge(arr, start, end, mid);

    }

    private static void marge(int[] arr, int start, int end, int mid) {
        int[] temp = new int[arr.length];
        int firstArrStart = start;
        int secondArrStart = mid + 1;
        int tempIndex = start;

        while (firstArrStart <= mid && secondArrStart <= end) {
            if (arr[firstArrStart] < arr[secondArrStart]) {
                temp[tempIndex++] = arr[firstArrStart++];
            } else {
                temp[tempIndex++] = arr[secondArrStart++];
            }
        }
        while (firstArrStart <= mid) {
            temp[tempIndex++] = arr[firstArrStart++];
        }
        while (secondArrStart <= end) {
            temp[tempIndex++] = arr[secondArrStart++];
        }
        while (start <= end) {
            arr[start] = temp[start++];
        }


    }

    public static void inputAndSort() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter count of numbers that must be sorted");
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        System.out.println("Please enter the numbers that must be sorted separated by comma");
        scanner.nextLine();
        String[] arr = scanner.nextLine().trim().split(",");
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }
        margeSort(numbers);
        for (int current : numbers) {
            System.out.printf("%d , ", current);
        }
    }

    public static void main(String[] args) {

        inputAndSort();

    }

}
