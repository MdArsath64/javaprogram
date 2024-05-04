public class FindPalindromeOfGivenString {
    // palindrome of a string
    public static void main(String[] args) {
    String s="malayalam arsu madam";
    String[] str=s.split(" ");
    for(int i=0;i<str.length;i++){
    String word=str[i];
    for(int j=0;j<word.length();j++){
    if(word.charAt(j)==word.charAt(word.
    length()-j-1)){
    System.out.print(word.charAt(j));}
    }
    System.out.print(" ");
    }
    }
 }

