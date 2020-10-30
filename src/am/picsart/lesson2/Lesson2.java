package am.picsart.lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        System.out.println("Task 1 . crate an array and fill it with number 2");
        int[] someArray = new int[5];
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = 2;
        }
        for (int i = 0; i < someArray.length; i++) {
            System.out.print(someArray[i] + ", ");
        }
        System.out.println("\n........................................................................\n");
        System.out.println("Task 2 . crate an array and fill it numbers from 1:1000");
        int[] someArray2 = new int[1000];
        for (int i = 0; i < someArray2.length; i++) {
            someArray2[i] = i + 1;
        }
        for (int i = 0; i < someArray2.length; i++) {
            System.out.print(someArray2[i] + ",");
        }
        System.out.println("\n........................................................................\n");
        System.out.println("Task 3 . crate an array and fill it odd numbers from -20:20");
        int[] someArray3 = new int[100];
        int lengthOfArray = 0;
        for (int i = -19; i <= 20; i += 2) {
            someArray3[lengthOfArray++] = i;
        }
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.print(someArray3[i] + ", ");
        }
        System.out.println("\n........................................................................\n");
        System.out.println("Task 4 . crate an array and fill it.Print all elements which can be divided by 5");
        int[] array1 = {-45, 35, 30, 45, -113, -91, 1, 5, 0};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 10 == 5 || array1[i] % 10 == -5 || array1[i] % 10 == 0) {
                System.out.print(array1[i] + ", ");
            }
        }
        System.out.println("\n........................................................................\n");

        System.out.println("Task 5 . create an array and fill it.Print all elements which are between 24.12 and 467.23");
        double[] array2 = {-45.67, 35.78, 3.0, 4.5, 113.8, -9.1, 10.9, 51.6, 30.9};
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 24.12 && array1[i] < 467.3) {
                System.out.print(array2[i] + ", ");
            }
        }
        System.out.println("\n........................................................................\n");
        System.out.println("Task 6 . create an array and fill it.Print count of elements which can be divided by 2");
        int[] array3 = {-4, 35, 30, 45, -116, -92, 1, 5, 0};
        int countOfEvenNumbers = 0;
        for (int i = 0; i < array3.length; i++) {
            if ((array3[i] & 1) == 0) {
                countOfEvenNumbers++;
            }
        }
        System.out.println(countOfEvenNumbers);
        System.out.println("\n........................................................................\n");
        System.out.println("Task 7 . Given an integer ,prints its first 10 multiples");
        int someNumber = 15;
        for (int i = 1; i < 11; i++) {
            System.out.println(someNumber + " x " + i + " = " + someNumber * i);
        }
        System.out.println("\n........................................................................\n");
        System.out.println("Task 8 . find count of numbers in power of 2 from given array.........");
        int countOfNumbersInPower2 = 0;
        int temp;
        int[] array = {0, 2, 16, 4, 32, 7891, 1, 64, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 1) {
                continue;
            }
            temp = array[i];
            while (temp % 2 == 0) {    //first decision with while loop
                temp /= 2;
            }
            if (temp == 1) {
                countOfNumbersInPower2++;
            }                         //..........................

//            if ((temp & temp - 1) == 0) { //second decision  with bit '&' operations
//                countOfNumbersInPower2++;
//            }
        }
        System.out.println(countOfNumbersInPower2);
        System.out.println("........................................................................");
    }


}
