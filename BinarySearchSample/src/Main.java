public class Main {
    public static void main(String[] args) {
        int[] numbers = { -50, -12, 5, 16, 42, 55, 108 };
        int searchValue = 42;
        System.out.println("Index of " + searchValue + " = " + binarySearch(numbers, searchValue));
    }

    private static int linearSearch(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value)
                return i;
        }

        return -1;
    }

    private static int binarySearch(int[] numbers, int value) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (numbers[middle] == value) {
                return  middle;
            }
            else if (numbers[middle] < value) {
                // right half
                start = middle + 1;
            }
            else {
                // left half
                end = middle - 1;
            }
        }

        return -1;
    }
}
