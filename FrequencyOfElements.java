import java.util.Arrays;
public class FrequencyOfElements {
    //frequency of elemet.in an array
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 3, 3, 5, 5, 7, 8, 8, 8};
        Arrays.sort(arr); // Sort the array to group identical elements together
        int i = 0;
        while (i < arr.length) {
            int num = arr[i];
            int one = i;
            while (i < arr.length && arr[i] == num) {
                i++;
            }
            int two = i - 1;
            int tot = two - one + 1;
            System.out.println(num + " occurred " + tot + " times");
        }
    }
}

