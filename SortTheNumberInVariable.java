//sort the n numbers in a variable
import java.util.Arrays;
public class SortTheNumberInVariable {
public static void main(String[] args){
int a[]=new int[6];
int rem,sum,i,j,num=592837;
j=0;
while(num>0){
rem=num%10;
a[j]=rem;
num=num/10;
j++;
}
Arrays.sort(a);
for(j=0;j<6;j++)
System.out.print(a[j]);
}
}