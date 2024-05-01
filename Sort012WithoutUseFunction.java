public class Sort012WithoutUseFunction {
// print 0,1,2 in sorted order without usimg any of sorting algorithm.
public static void main(String[] args) {
int[] a={1,0,2,1,1,0,2,1,0};
int b0=0,b1=0,b2=0;
for(int i=0;i<a.length;i++){
if(a[i]==0) b0++;
else if(a[i]==1) b1++;
else
b2++;
}
for(int i=0;i<b0;i++){
System.out.print("0"+" ");}
for(int i=0;i<b1;i++){
System.out.print("1"+" ");}
for(int i=0;i<b2;i++){
System.out.print("2"+" ");}
}
}

