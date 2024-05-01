import java.util.ArrayList;
public class IntersectionOfTwoArray {
    //intersection or 2.arrays)
public static void main(String[] args){
int[] ar = {1, 2, 3, 4, 5};
int[] br= {4, 5, 6, 7,8};
ArrayList<Integer> dr = new ArrayList<>();
ArrayList<Integer> cr = new ArrayList<>();
for (int element:ar){
cr.add(element);}
for(int element:br){
cr.add(element);}
System.out.println(cr);
for (int i= 0;i< cr.size(); i++){
for (int j=i+1;j<cr.size();j++){
if (cr.get(i)==cr.get(j)){
if(!dr.contains(cr.get(i))){
dr.add(cr.get(i));
}
}}
}
System.out.println(dr);
}
}

