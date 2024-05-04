import java.util.Arrays;
public class SortStringInAscending {
    //sort the string in ascending
    public static String sortString(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
        
    }

    public static void main(String[] args) {
        String input = "ecdab";
        String sortedString = sortString(input);
        System.out.println("Sorted String:");
        System.out.println(sortedString);
    }
}
