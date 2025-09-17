public class main {
    public static void main(String[] args){ //constant
        int[] numbers = new int[10]; //initialize array
        numbers[0] = 25;
        numbers[1] = -3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 62;
        numbers[6] = 20;
        numbers[7] = -8;
        numbers[8] = 173;
        numbers[9] = 65;

        System.out.println("Before Selection Sort");
        printArrayElements(numbers); //call function retroactively

        System.out.println("\n\nAfter Selection Sort");
        selectionSort(numbers); //place bubbleSort/selectionSort here instead to use that
        printArrayElements(numbers);


    } //right click over highlight variable to rename all
    //lowest to highest pair by pair
    private static void bubbleSort(int[] arr){
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--){ //check reverse order
            for (int i = 0; i < lastSortedIndex; i++){
                if (arr[i] > arr[i + 1]){ //get current element and compare with next
                    int temp = arr[i]; //get temp variable to store swap
                    arr[i] = arr[i + 1]; //swap. Next var becomes current
                    arr[i + 1] = temp; //next var becomes former current
                }
            }
        }
    }
    //lowest to highest biggest switches
    private static void selectionSort(int[] arr) {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--){
            int largest = 0; //temp value

            for (int i = 1; i <= lastSortedIndex; i++){ //i must reach last variable
                if (arr[i] > arr[largest]){
                    largest = i;
                }
            }
            if (largest != lastSortedIndex) {
                int temp = arr[largest];
                arr[largest] = arr[lastSortedIndex];
                arr[lastSortedIndex] = temp;
            }
        }
    }

    private static void printArrayElements(int[] arr){
        for (int i = 0; i < arr.length; i++){ //arr.length = array length
            System.out.print(arr[i] + " ");
        }
        //for (int j : arr) { //only works for linear reading
            //System.out.print(j + " ");
        //}
    }
}
