package am.picsart.lesson7.main;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        write("C:\\Users\\Galust\\Desktop\\students.txt");
    }

    public static void write(String path) throws IOException {

        FileWriter fileWriter = new FileWriter(path, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        int[] arr = read(path);
        printWriter.append("\n");
        int min = getMin(arr);
        int max = getMax(arr);
        printWriter.append("min= ").append(String.valueOf(min)).append("\n");
        printWriter.append("max= ").append(String.valueOf(max)).append("\n");
        printWriter.close();
    }

    private static int[] read(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner s = new Scanner(file);
        String[] arrOfNum = s.nextLine().split(" ");
        return fromStringArr(arrOfNum);
    }

    private static int[] fromStringArr(String[] arrOfNum) {
        int[] result = new int[arrOfNum.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(arrOfNum[i]);
        }
        return result;
    }

    private static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
