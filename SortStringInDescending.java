import java.util.Arrays;
import java.util.Collections;
public class SortStringInDescending {
    //sort the descending
    public static String sortStringDescending(String input) {
        // Convert string to character array
        Character[] chars = new Character[input.length()];
        for (int i = 0; i < input.length(); i++) {
            chars[i] = input.charAt(i);
        }
        // Sort character array in descending order
        Arrays.sort(chars, Collections.reverseOrder());
        // Convert character array back to string
        StringBuilder sortedString = new StringBuilder(chars.length);
        for (char c : chars) {
            sortedString.append(c);
        }
        return sortedString.toString();
    }
    public static void main(String[] args) {
        String input = "ecdab";
        String sortedStringDescending = sortStringDescending(input);
        System.out.println("Sorted String in Descending Order:");
        System.out.println(sortedStringDescending);
    }
}

// -------------Another method----------------
// //sort string in descending
// import java.util.Arrays;
// import java.util.Comparator;

// public class SortString {
//     public static String sortString(String input) {
//         char[] chars = input.toCharArray();
//         Arrays.sort(chars);
//         StringBuilder sb = new StringBuilder(String.valueOf(chars));
//         return sb.reverse().toString();
//     }

//     public static void main(String[] args) {
//         String input = "ecdab";
//         String sortedString = sortString(input);
//         System.out.println("Sorted String (Descending):");
//         System.out.println(sortedString);
//     }
// }