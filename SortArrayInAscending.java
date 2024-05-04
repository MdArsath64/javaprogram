import java.util.Arrays;
public class SortArrayInAscending {
    //sorted array in ascending
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 3, 4};
        
        // Sorting the array
        Arrays.sort(arr);
        
        // Printing the sorted array
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5]
    }
}

