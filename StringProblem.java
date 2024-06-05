// import java.io.*;
public class StringProblem {
public static void main(String[] args) {
String s="a3b2";
int m=0,n=0;
char[] ca=new char[s.length()/2];
int[] na=new int[s.length()/2];
char[] ch=s.toCharArray();
for(int i=0;i<ch.length;i++){
if(ch[i]>='1' && ch[i]<='9'){
na[m]=ch[i]-'0';
m++;
}
else if(ch[i]>='a' && ch[i]<='z'){
   ca[n]=ch[i];
n++;}
}
System.out.println(ca);
System.out.println(na[0]);
StringBuilder sb=new StringBuilder();
for(int i=0;i<ca.length;i++){
char chrs=ca[i];
int ele=na[i];
// System.out.print(ele);
for(int j=0;j<ele;j++){
sb.append(chrs);
}
}
System.out.print(sb.toString());
// System.out.println(sb);
}
}
//Output-aaabb

