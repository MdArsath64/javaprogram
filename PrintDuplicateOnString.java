import java.util.ArrayList;
import java.util.Arrays;
public class PrintDuplicateOnString {
public static void main(String[] args){
String s="arzuraju";
char[] ar = s.toCharArray();
Arrays.sort(ar);
System.out.println(Arrays.toString(ar));
ArrayList<Character> br = new
ArrayList<>();
for (int i= 0; i< ar.length; i++){
for (int j=i+1;j< ar.length; j++){
if (ar[i]== ar[j] &&!br.contains(ar[i])){
br.add(ar[i]);
}
}
}
System.out.println(br);
}
}


