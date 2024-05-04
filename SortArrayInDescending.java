import java.util.Arrays;
import java.util.Collections;
public class SortArrayInDescending {
    //Sort array in descending order
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 1, 3, 4}; // Using Integer instead of int to work with Collections.reverseOrder()
        
        // Sorting the array in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        
        // Printing the sorted array
        System.out.println(Arrays.toString(arr)); // Output: [5, 4, 3, 2, 1]
    }
}

