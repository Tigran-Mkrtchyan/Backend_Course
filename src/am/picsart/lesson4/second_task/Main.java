package am.picsart.lesson4.second_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("............. method length ,toLowerCase and toUpperCase...............");
        System.out.println("Please enter some string ...");
        String str = s.nextLine();
        System.out.println("input characters count  is `" + str.length());
        System.out.println("input with Upper case character`" + str.toUpperCase());
        System.out.println("input with lower case character`" + str.toLowerCase());
        System.out.println("...........................................");

        System.out.println("............. method toCharArray ...............");
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + " symbol is " + array[i] + ", ");
        }
        System.out.println("\n...........................................");

        System.out.println("............. method charAt ...............");
        System.out.println("Please enter number of symbol it can be in 0 to " + (str.length() - 1));
        int num = s.nextInt();
        System.out.println("symbol in " + num + " place  is `" + str.charAt(num));
        System.out.println("...........................................");

        System.out.println("............. methods split, trim, equals and equalIgnoreCase  ...............");
        System.out.println("Please enter  2 strings and separate them with comma");
        s.nextLine();
        str = s.nextLine();
        String[] arr = str.split(",");
        System.out.println("first string  is equal second ` " + arr[0].trim().equals(arr[1].trim()));
        System.out.println("first string  is equal (ignore case )second ` " + arr[0].trim().equalsIgnoreCase(arr[1].trim()));
        System.out.println("...........................................");

        System.out.println("............. compereTo and compereToIgnoreCase...............");
        System.out.println("Please enter first string");
        str = s.nextLine();
        System.out.println("Please enter second string");
        String str2 = s.nextLine();
        int resultCompereTo = str.compareTo(str2);
        int resultCompereToIgnoreCase = str.compareToIgnoreCase(str2);
        str = resultCompereTo > 0 ? "first is greater " : resultCompereTo == 0 ? "they are equal" : "second is greater";
        str2 = resultCompereToIgnoreCase > 0 ? "first is greater " : resultCompereToIgnoreCase == 0 ? "they are equal" : "second is greater";
        System.out.println("comparing with compereTo " + str);
        System.out.println("comparing with compereToIgnoreCase " + str2);
        System.out.println("..................................................................");

        System.out.println("............. indexOf and LastIndexOf...............");
        System.out.println("Please enter some string");
        str = s.nextLine();
        System.out.println("Please enter substring");
        String subString = s.nextLine();
        int firstResult = str.indexOf(subString);
        int lastResult = str.lastIndexOf(subString);
        if (firstResult == -1) {
            System.out.println("string is not contain substring");
        } else {
            System.out.println(str);
            System.out.println("first matching index :" + firstResult);
            System.out.println("last matching index :" + lastResult);
        }
        System.out.println("..................................................................");
        System.out.println("............. method replace ,subString...............");
        System.out.println("Please enter some string");
        str = s.nextLine();
        System.out.println("Enter index for start subString");
        int start = s.nextInt();
        System.out.println("Enter index for end subString");
        int end = s.nextInt();
        System.out.println("Enter replace string");
        s.nextLine();
        String replace = s.nextLine();
        String sub = str.substring(start, end);
        System.out.println("substring is : " + sub);
        str = str.replace(sub, replace);
        System.out.println("after replacing : " + str);
        System.out.println("..................................................................");
    }
}
