public class Main {
    public static void main(String[] args) {
        int[] numbers = { -50, -12, 5, 16, 42, 55, 108 };
        int searchValue = 42;
        System.out.println("Index of " + searchValue + " = " + ledesmaSearch(numbers, searchValue));
    }

    private static int ledesmaSearch(int[] numbers, int value) {
        for (int i = 0; i < numbers.length;) {
            if (numbers[i] == value) {
                return i;
            }
            else{
                i = i + 2;
            }
        }
        for (int i = 3; i < numbers.length;) {
            if (numbers[i] == value) {
                return i;
            }
            else{
                i = i + 2;
            }
        }
        if (numbers[1] == value)
        {
            return 1;
        }
        return -1;
    }
}
