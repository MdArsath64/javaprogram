public class Capitalize{
public static void main(String[] args){
    String myinput = "capitalize letters in a sentance";
// store each character to a char array
char[] charAray = myinput.toCharArray();
System.out.println("Before capitalizing:"+myinput);
// for loop to capitalize first letter
for(int i = 0; i< charAray.length; i++){
    // capitalizing first letter of first word 
    charAray[0] = Character.toUpperCase(charAray[0]);
    charAray[charAray.length-1] = Character.toUpperCase(charAray[charAray.length-1]);
// loop to check if there is space betweentwo letters
if(charAray[i] ==' '){
charAray[i+1] = Character.toUpperCase(charAray[i+1]);
charAray[i-1] = Character.toUpperCase(charAray[i-1]);
}
}
// converting the character array to the string
myinput = String.valueOf(charAray);
// to print the final result
System.out.println("After capitalizing:"+ myinput);
}
}