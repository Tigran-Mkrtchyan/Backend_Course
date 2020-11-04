package am.picsart.lesson3.first_task;


public class SortingAlgorithm {
    public void sortByBubble(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
            }
    }

    public void sortBySelection(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[minIndex] > numbers[j]) {
                    minIndex = j;
                }
            }
            swap(numbers, i, minIndex);
        }
    }

    public void sortByInsertion(int[] numbers) {
        int temp;
        int j;
        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[i];
            j = i;
            while (j > 0 && temp < numbers[j - 1]) {
                numbers[j] = numbers[--j];
            }
            numbers[j] = temp;
        }
    }


    private void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }

    public void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 123, 7, 23, 4, 9, 42, 12, 7, 65, 123, 2};
        SortingAlgorithm sort = new SortingAlgorithm();
        sort.printNumbers(numbers);
        sort.sortByBubble(numbers);
//        sort.sortBySelection(numbers);
//        sort.sortByInsertion(numbers);
        sort.printNumbers(numbers);
    }
}
