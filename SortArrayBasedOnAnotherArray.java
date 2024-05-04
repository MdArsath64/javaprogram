import java.util.Arrays;
public class SortArrayBasedOnAnotherArray {
    //sort 1st array based on 2nd array
    public static void main(String[] args) {
        int[] arr = {8, 12, 3, 12, 16};
        int[] brr = {4, 2, 2, 6, 5};
        // Call the sorting method
        sortArrBasedOnBrr(arr, brr);
        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void sortArrBasedOnBrr(int[] arr, int[] brr) {
        // Use bubble sort to sort arr based on brr
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (brr[i] < brr[j]) {
                    // Swap arr elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    // Swap brr elements
                    temp = brr[i];
                    brr[i] = brr[j];
                    brr[j] = temp;
                }
            }
        }
    }
}

