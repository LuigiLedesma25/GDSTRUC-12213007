public class ArrayOperations {
    public static void main(String[] args) {
        // record time stamp at start of algorithm
        int[] numbers = new int[5]; //array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        int searchValue = 5;

        //perform algorithm
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == searchValue) {
                System.out.println(searchValue + " is in index " + i );
            }

        }

        //record time stamp at end


    }
}