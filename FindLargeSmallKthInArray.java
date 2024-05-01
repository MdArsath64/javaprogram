public class FindLargeSmallKthInArray {
    public static void main(String[] args) {
    int arr[]={20,60,10,50,30,40};
// kth min and kth max of array element
    int lar=arr[0]; int seclar=arr[0];
    int sml=arr[0]; int secsml=arr[0];
    int min=arr[0]; int max=arr[0];
    for(int i=0;i<arr.length;i++){
    if(arr[i]>lar){
    lar=arr[i];}
    else if(arr[i]<sml){
    sml=arr[i];}}
    for(int i=0;i<arr.length;i++){
    if(arr[i]>seclar && arr[i]<lar){
    seclar=arr[i];}
    else if(arr[i]<secsml && arr[i]>sml){
    secsml=arr[i];}
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max && arr[i]<seclar){
    max=arr[i];}
    else if(arr[i]<min && arr[i]>secsml){
    min=arr[i];}}
    System.out.println("large:"+lar);
    System.out.println("small:"+sml);
    System.out.println("seondlar:"+seclar);
    System.out.println("secondsml:"+secsml);
    System.out.println("kth max:"+max);
    System.out.println("kth min:"+min);
    }
    }
    }
    